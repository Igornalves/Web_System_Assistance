package com.maizenatv.assistenciawebsistema.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Você pode usar outras estratégias, se necessário
    private Long id;
}