package com.maizenatv.assistenciawebsistema.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "payments")
public class Pagamentos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
