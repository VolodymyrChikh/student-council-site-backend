package com.example.amiscs.service;

import com.example.amiscs.domain.File;
import com.example.amiscs.dto.FileRequest;
import com.example.amiscs.dto.FileResponse;
import com.example.amiscs.dto.FileResponses;
import com.example.amiscs.dto.FileUpdateRequest;
import com.example.amiscs.exceptions.FileNotFoundException;
import com.example.amiscs.mapper.FileMapper;
import com.example.amiscs.repository.FileRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileService {

  @Autowired
  private final FileRepository fileRepository;
  private final FileMapper fileMapper;

  @Transactional
  public FileResponse save(FileRequest fileRequest) {
    File file = fileMapper.toFile(fileRequest);
    return fileMapper.toFileResponse(fileRepository.save(file));
  }

  public FileResponse findById(Long id) {
    File file = fileRepository.findById(id).
        orElseThrow(() -> new FileNotFoundException("File Not Found"));
    return fileMapper.toFileResponse(file);
  }

  public FileResponses findAll() {
    return new FileResponses(fileRepository.findAll().stream()
        .map(fileMapper::toFileResponse)
        .toList());
  }

  public FileResponse update(Long id, FileUpdateRequest fileUpdateRequest) {
    File file = fileRepository.findById(id).
        orElseThrow(() -> new FileNotFoundException("File Not Found"));

    file.setFileName(fileUpdateRequest.getFileName());
    file.setUrl(fileUpdateRequest.getUrl());

    File updatedFile = fileRepository.save(file);

    return fileMapper.toFileResponse(updatedFile);
  }

  public void deleteById(Long id) {
    fileRepository.deleteById(id);
  }

}
