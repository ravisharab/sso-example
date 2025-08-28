package com.ravi.sso.example;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('SCOPE_readUser')")
    public String getUser(){
        return "Hi User";
    }

}
