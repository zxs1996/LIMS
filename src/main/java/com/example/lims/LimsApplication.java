package com.example.lims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//先禁用security
@SpringBootApplication( exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@EnableSwagger2
public class LimsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimsApplication.class, args);
    }

}
