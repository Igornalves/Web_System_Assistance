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
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "technicians")
public class Tecnicos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Esse campo e obrigatorio")
    private String nome;

    private String especializacao;

    private boolean disponibilidade;

    @NotBlank(message = "Esse campo e obrigatorio")
    private String telefone; 

    @NotBlank(message = "Esse campo e obrigatorio")
    private String email;

    @Lob
    @Basic(fetch = FetchType.LAZY) 
    @Column(nullable = true)
    private byte[] certificacao; 

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;
}
