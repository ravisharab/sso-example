package com.ravi.sso.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class SsoExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoExampleApplication.class, args);

    }

}
