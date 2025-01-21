package com.maizenatv.assistenciawebsistema.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name="clients")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // Você pode usar outras estratégias, se necessário
    private UUID id;

    private String nome; 

    @NotBlank(message = "Esse campo e obrigatorio")
    @Email(message = "o campo deve ter um email valido")
    private String email;

    private int numeroDeTelefone; 

    private int cpf;

    private int cnpf; 

    @CreationTimestamp
    private LocalDateTime dataDeCriacao;
}