package com.behpaya.fileManagement.repository; 
 /* 
sanaei 
created on 8/4/2024 
  */

import com.behpaya.fileManagement.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}