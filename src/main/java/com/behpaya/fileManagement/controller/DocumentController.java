package com.behpaya.fileManagement.controller;

import com.behpaya.fileManagement.domain.Document;
import com.behpaya.fileManagement.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")

public class DocumentController {
   @Autowired
   private DocumentService documentService;

   @GetMapping
   public ResponseEntity<List<Document>> getAllDocuments() {
      return ResponseEntity.ok(documentService.getAllDocuments());
   }

   @PostMapping
   public ResponseEntity<Document> createDocument(@RequestBody Document document) {
      return ResponseEntity.ok(documentService.saveDocument(document));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deleteDocument(@PathVariable Long id) {
      documentService.deleteDocument(id);
      return ResponseEntity.ok().build();
   }

   // Add endpoints for updating and other functionalities
}