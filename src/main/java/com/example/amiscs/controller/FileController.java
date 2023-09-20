package com.example.amiscs.controller;

import com.example.amiscs.dto.FileRequest;
import com.example.amiscs.dto.FileResponse;
import com.example.amiscs.dto.FileResponses;
import com.example.amiscs.service.FileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/files")
public class FileController {

  private final FileService fileService;

  @PostMapping
  public FileResponse save(@Valid @RequestBody FileRequest fileRequest) {
    return fileService.save(fileRequest);
  }

  @GetMapping("/{id}")
  public FileResponse findById(@PathVariable Long id) {
    return fileService.findById(id);
  }

  @GetMapping
  public FileResponses findAll() {
    return fileService.findAll();
  }


  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    fileService.deleteById(id);
  }

}
