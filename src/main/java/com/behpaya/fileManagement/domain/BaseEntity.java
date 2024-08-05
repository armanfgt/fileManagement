package com.behpaya.fileManagement.domain; 
 /* 
sanaei 
created on 8/4/2024 
  */


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

   @Column(name = "DESCRIPTION")
   private String description;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
