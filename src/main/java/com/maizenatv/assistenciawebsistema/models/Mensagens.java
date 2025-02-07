package com.maizenatv.assistenciawebsistema.models;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "messages")
public class Mensagens {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id", nullable = false)
    private Tecnicos tecnicos;

    @ManyToOne
    @JoinColumn(name = "usuario_remetente", nullable = false)
    private Clientes clientes;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String mensagem;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "TEXT")
    private Date data_envio;
}
