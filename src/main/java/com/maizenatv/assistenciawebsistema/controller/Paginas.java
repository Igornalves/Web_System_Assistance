package com.maizenatv.assistenciawebsistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


@Controller
// Removemos @RestController, pois ele faz com que os métodos retornem apenas texto ou JSON.
public class Paginas {
    
    @Operation(summary = "Pagina inicial", description = "Retorna a pagina HTML inicial")
    @ApiResponse(responseCode = "200", description = "Pagina inicial renderizada", content = @Content(mediaType = "text/html"))
    @ApiResponse(responseCode = "404", description = "pagina nao renderizada com sucesso", content = @Content(mediaType = "text/html"))
    @GetMapping("/")
    public String Pagehome() {
        return "home";
    }
    
}
