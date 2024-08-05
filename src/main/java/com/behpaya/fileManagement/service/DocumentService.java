package com.behpaya.fileManagement.service; 
 /* 
sanaei 
created on 8/4/2024 
  */


import com.behpaya.fileManagement.domain.Document;
import com.behpaya.fileManagement.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
   @Autowired
   private DocumentRepository documentRepository;

   public List<Document> getAllDocuments() {
      return documentRepository.findAll();
   }

   public Document saveDocument(Document document) {
      return documentRepository.save(document);
   }

   public void deleteDocument(Long id) {
      documentRepository.deleteById(id);
   }

   // Additional methods for editing and other operations
}