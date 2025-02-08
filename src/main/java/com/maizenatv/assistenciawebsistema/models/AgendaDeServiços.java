package com.maizenatv.assistenciawebsistema.models;

import java.time.LocalDate;
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
@Table(name = "service_schedule")
public class AgendaDeServiços {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "orders_id", nullable = false)
    private OrdensDeServico ordensDeServico;

    @ManyToOne
    @JoinColumn(name = "tecnico_id", nullable = false)
    private Tecnicos tecnicos;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_horario")
    private LocalDate data_horario;

    @Column(columnDefinition = "TEXT")
    private String descricao;

}
