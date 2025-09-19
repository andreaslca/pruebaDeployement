package com.example.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/saludo/{nombre}")
    public String getNombre(@PathVariable String nombre){
        return "Hola " + nombre;
    }
}
