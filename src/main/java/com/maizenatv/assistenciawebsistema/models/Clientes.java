package com.maizenatv.assistenciawebsistema.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name="clients")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "TEXT")
    private String nome; 

    @NotBlank(message = "Esse campo e obrigatorio")
    @Email(message = "o campo deve ter um email valido")
    private String email;

    @Column(columnDefinition = "TEXT")
    private String telefone; 

    @NotBlank(message = "Esse campo e obrigatorio")
    private String cpf_cnpj;

    @NotBlank(message = "Esse campo e obrigatorio")
    private String cep; 

    @Column(columnDefinition = "TEXT")
    private String endereco;

    @Lob
    @Basic(fetch = FetchType.LAZY) 
    @Column(nullable = true)
    private byte[] documentacao; 

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;
}