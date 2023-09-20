package com.example.amiscs.dto;

import lombok.Data;

@Data
public class FileResponse {

  private final Long ownerId;
  private final String fileName;
  private final String url;
  private final String type;
  private final Long size;
  private final String createdAt;
  private final String updatedAt;

}
