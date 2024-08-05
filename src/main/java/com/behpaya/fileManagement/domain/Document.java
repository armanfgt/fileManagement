package com.behpaya.fileManagement.domain; 
 /* 
sanaei 
created on 8/4/2024 
  */


import javax.persistence.*;

@Entity
@Table(name = "DOCUMENT")
@SequenceGenerator(name = "documentSequence", sequenceName = "DOCUMENT_SEQ", initialValue = 1, allocationSize = 1)
public class Document extends  BaseEntity{

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documentSequence")
   @Column(name = "ID", nullable = false)
   private Long id;

   @Column(nullable = false)
   private String name;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}