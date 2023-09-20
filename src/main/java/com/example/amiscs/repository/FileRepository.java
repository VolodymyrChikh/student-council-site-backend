package com.example.amiscs.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import com.example.amiscs.domain.File;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
@ComponentScan(basePackages = "com.example.amiscs.repository")
@Configuration
@EnableAutoConfiguration
public interface FileRepository extends JpaRepository<File, Long> {}
