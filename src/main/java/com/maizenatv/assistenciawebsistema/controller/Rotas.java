package com.maizenatv.assistenciawebsistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.maizenatv.assistenciawebsistema.services.CustomerService;

@Controller
@RestController // pois ele faz com que os métodos retornem apenas texto ou JSON
public class Rotas {

    @Autowired
    private CustomerService viaCepService;

    @GetMapping("/rotateste")
    public String GetRota(){
        return "Olá coisas novas";
    }

    @GetMapping("/cep/{cep}")
    public Object buscarEndereco(@PathVariable String cep) {
        return viaCepService.buscarEnderecoPorCep(cep);
    }
} 