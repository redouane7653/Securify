package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ClientNotFoundException;

import com.example.persistance.domain.Client;
import com.example.persistance.repository.ClientRepository;
import com.example.rest.dto.ClientDTO;

//import lombok.AllArgsConstructor;

@Service
//@AllArgsConstructor
public class ClientService {
	@Autowired
	private ClientRepository repo;
	@Autowired
	private ModelMapper mapper;
	
	private ClientDTO mapToDTO(Client client) {
		return this.mapper.map(client, ClientDTO.class);
	}
	
	public ClientDTO addClient(Client client) {
		Client saved = this.repo.save(client);
		return this.mapToDTO(saved);
	}
	public List<ClientDTO>getAllClients(){
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public ClientDTO updateClient(Long idClient, Client client) {
		Optional<Client> tempClient = Optional.of(this.repo.findById(idClient).orElseThrow(ClientNotFoundException::new));
		
		Client existing = tempClient.get();
		existing.setName(client.getName());
		existing.setOfficers(client.getOfficers());
		
		Client updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean deleteClient(Long idClient) {
		this.repo.findById(idClient).orElseThrow(ClientNotFoundException::new);
		this.repo.deleteById(idClient);
		boolean exists = this.repo.existsById(idClient);
		return !exists;
	}
	
	public ClientDTO readById(Long idClient) {
        Client found = this.repo.findById(idClient).orElseThrow(ClientNotFoundException::new);
        return this.mapToDTO(found);
    }
	public ClientDTO readByName(String name) {
		Client found = this.repo.clientByName(name).orElseThrow(ClientNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	
}
