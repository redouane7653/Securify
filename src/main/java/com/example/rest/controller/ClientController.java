package com.example.rest.controller;
//import lombok.AllArgsConstructor;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistance.domain.Client;
import com.example.rest.dto.ClientDTO;
import com.example.service.ClientService;



@RestController
//@AllArgsConstructor
public class ClientController {
	@Autowired
	private ClientService service;
	
	@PostMapping("/AddClient")
	public ClientDTO addclient(@RequestBody Client client) {
		return service.addClient(client);
				
	}
	
	@GetMapping("/allClients")
	public List<ClientDTO> getAllClients(){
		return service.getAllClients();
	}
	
	@PutMapping("/updateClient/{id}")
	public ClientDTO updateClient(@PathVariable Long idClient, @RequestBody Client client) {
		return service.updateClient(idClient, client);
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public boolean deleteClient(@PathVariable Long idClient) {
		return service.deleteClient(idClient);
	}
	
	@GetMapping("/clientById")
	public ClientDTO readClientById(@PathParam("id") Long idClient) {
		return service.readById(idClient);
	}
	
	@GetMapping("/clientByName")
	public ClientDTO readByName(@PathParam("name") String name){
		return service.readByName(name);
	}

}


