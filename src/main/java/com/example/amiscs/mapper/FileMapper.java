package com.example.amiscs.mapper;

import com.example.amiscs.domain.File;
import com.example.amiscs.dto.FileRequest;
import com.example.amiscs.dto.FileResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface FileMapper {
  File toFile(FileRequest fileRequest);
  FileResponse toFileResponse(File file);
  FileRequest toFileRequest(File file);

}
