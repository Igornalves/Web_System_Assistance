package com.maizenatv.assistenciawebsistema.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "used_parts")
public class PecasUtilizadas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
}
