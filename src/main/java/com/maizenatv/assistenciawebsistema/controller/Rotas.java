package com.maizenatv.assistenciawebsistema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rotas {

    @GetMapping("/")
    public String GetRota(){
        return "Olá mundo";
    }
} 