package com.example.hustar.repository;

import com.example.hustar.domain.UploadFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadFileRepository extends JpaRepository<UploadFile, Long> {
}
