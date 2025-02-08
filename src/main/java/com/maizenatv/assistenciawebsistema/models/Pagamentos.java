package com.maizenatv.assistenciawebsistema.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name = "payments")
public class Pagamentos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "orders_id", nullable = false)
    private OrdensDeServico ordensDeServico;

    @Column(name = "valor_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento")
    private LocalDate data_pagamento;

    @Column(columnDefinition = "TEXT")
    private String metodo;

    @Column(columnDefinition = "TEXT")
    private String status;

    @CreationTimestamp
    private LocalDateTime created_at;
}
