package com.example.amiscs.service;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import java.time.Duration;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BlobService {

  private final BlobServiceClient blobServiceClient;

  public void getContainerClient() {
    BlobContainerClient containerClient =
        blobServiceClient.getBlobContainerClient("container");
  }

  public void createContainer() {
    BlobContainerClient containerClient =
        blobServiceClient.createBlobContainer("container");
  }

  public void deleteContainer() {

  }

}