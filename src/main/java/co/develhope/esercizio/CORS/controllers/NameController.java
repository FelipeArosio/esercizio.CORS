package co.develhope.esercizio.CORS.controllers;

import org.springframework.web.bind.annotation.*;

import java.security.GeneralSecurityException;

@RestController
@RequestMapping ("/name")
public class NameController {
    @GetMapping
    public String getName (@RequestParam String name) {
        return name;
    }

    @PostMapping
    public String reverseName (@RequestParam String name) {
        StringBuilder reverseName = new StringBuilder(name);
        return reverseName.reverse().toString();
    }
}
