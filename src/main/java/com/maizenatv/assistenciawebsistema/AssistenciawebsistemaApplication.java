package com.maizenatv.assistenciawebsistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Assistencia Tecnica Web ", version = "1.0", description = "Criando um Gestor Web para criacao de Ordens de servicos e geracao de notas para assistencias tecnicas ou para tecnicos independentes de forma que possa usar mecanismos de facilidades para os trabalahdores"))
public class AssistenciawebsistemaApplication {
	public static void main(String[] args) {
		SpringApplication.run(AssistenciawebsistemaApplication.class, args);
	}
}
