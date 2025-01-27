package com.ravitech.crud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudExampleApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootCrudExampleApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudExampleApplication.class, args);
    }
}

