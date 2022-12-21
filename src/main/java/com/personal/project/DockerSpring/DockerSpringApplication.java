package com.personal.project.DockerSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerSpringApplication.class, args);
    }

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World | This is Nishant Kumar";
    }

}
