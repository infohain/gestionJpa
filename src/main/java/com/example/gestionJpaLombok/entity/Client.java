package com.example.gestionJpaLombok.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Client {

    @Id
    private int id;
    private String nom;
    private String ville ;
}
