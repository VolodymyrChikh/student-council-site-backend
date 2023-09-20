package com.example.amiscs.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Data;
import org.springframework.util.MimeType;

@Data
public class FileRequest {

  @Id
  @Min(1)
  @NotNull
  private final Long ownerId;

  @NotNull
  private final String fileName;

  @NotNull
  private final MimeType type;

  @NotNull
  private final Long size;

  @NotNull
  private final String url;

  @NotNull
  private final LocalDate createdAt;

  @NotNull
  private final LocalDate updatedAt;
}
