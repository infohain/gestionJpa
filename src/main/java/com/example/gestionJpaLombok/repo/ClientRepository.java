package com.example.gestionJpaLombok.repo;

import com.example.gestionJpaLombok.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
