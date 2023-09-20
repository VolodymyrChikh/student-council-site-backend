package com.example.amiscs.dto;

import lombok.Data;

@Data
public class FileUpdateRequest {

    private final String fileName;
    private final String url;
}
