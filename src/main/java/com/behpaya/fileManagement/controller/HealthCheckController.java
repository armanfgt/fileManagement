package com.behpaya.fileManagement.controller; 
 /* 
sanaei 
created on 8/3/2024 
  */


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

   @GetMapping(value ="/health-check")
   public String healthCheck() throws Exception{
      return "200";
   }
}
