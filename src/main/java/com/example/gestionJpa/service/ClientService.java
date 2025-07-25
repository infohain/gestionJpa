package com.example.gestionJpa.service;

import com.example.gestionJpa.entity.Client;
import com.example.gestionJpa.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public Client updateClient(Long id, Client newClientData) {
        return clientRepository.findById(id).map(client -> {
            client.setNom(newClientData.getNom());
            client.setVille(newClientData.getVille());
            return clientRepository.save(client);
        }).orElse(null);
    }
}
