package com.example.amiscs.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.MimeType;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "files")
public class File {

  @Id
  private Long ownerId;

  private String fileName;

  private MimeType type;

  private Long size;

  private String url;

  private LocalDate createdAt;

  private LocalDate updatedAt;

}
