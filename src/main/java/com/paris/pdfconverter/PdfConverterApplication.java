package com.paris.pdfconverter;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Log
public class PdfConverterApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(PdfConverterApplication.class, args);
        applicationContext.registerShutdownHook();
        String userDir = System.getProperty("user.dir");
        log.info("Hello world. user dir is: " + userDir);
    }

}

