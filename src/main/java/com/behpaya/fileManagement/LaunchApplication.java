package com.behpaya.fileManagement; 
 /* 
sanaei 
created on 8/3/2024 
  */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication()
public class LaunchApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(LaunchApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LaunchApplication.class, args);
        LOGGER.info("FileManagement application started successfully !");
    }
}
