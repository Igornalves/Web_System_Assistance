package com.maizenatv.assistenciawebsistema.models;

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
@Table(name = "order_status_history")
public class HistoricoDeStatusDaOS {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "tecnicos_id", nullable = false,updatable = false)
    private Tecnicos tecnicos; 

    @Column(columnDefinition = "TEXT", nullable = false)
    private String status;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_alteracao")
    private Data data_alteracao;
}
