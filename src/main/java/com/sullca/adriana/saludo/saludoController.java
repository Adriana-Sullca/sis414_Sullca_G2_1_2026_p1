package com.sullca.adriana.saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class saludoController {

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        return "Hola Mundo!!!";
    }
}