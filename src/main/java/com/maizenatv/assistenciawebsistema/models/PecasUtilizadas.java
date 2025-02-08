package com.maizenatv.assistenciawebsistema.models;

import java.math.BigDecimal;
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
import lombok.Data;


@Data
@Entity
@Table(name = "used_parts")
public class PecasUtilizadas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "orders_id", nullable = false)
    private OrdensDeServico ordensDeServiço;

    @Column(nullable = false)
    private long quantidade;

    @Column(name = "valor_unitario", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor_unitario;

    @CreationTimestamp
    private LocalDateTime created_at;
}
