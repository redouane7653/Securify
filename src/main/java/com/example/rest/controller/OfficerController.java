package com.example.rest.controller;


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

import com.example.persistance.domain.Officer;
import com.example.rest.dto.OfficerDTO;
import com.example.service.OfficerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class OfficerController {
	
	@Autowired
	private OfficerService service;
	
	@PostMapping("addOfficer")
	public OfficerDTO addOfficer(@RequestBody Officer officer) {
		return service.addOfficer(officer);
	}
	
	@GetMapping("/allOfficers")
	public List<OfficerDTO> getAllOfficers(){
		return service.getAllOfficers();
	}
	
	@PutMapping("/updateOfficer/{idOfficer}")
	public OfficerDTO updateOfficer(@PathVariable Long idOfficer, @RequestBody Officer officer) {
		return service.updateOfficer(idOfficer, officer);
	}
	
	@DeleteMapping("/deleteOfficer/{id}")
	public boolean deleteOfficer(@PathVariable Long idOfficer) {
		return service.deleteOfficer(idOfficer);
	}
	
	@GetMapping("/officerById")
	public OfficerDTO readOfficerById(@PathParam("id") Long idOfficer) {
		return service.readById(idOfficer);
	}
	
	@GetMapping("/officerByName")
	public List<OfficerDTO> readOfficerByName(@PathParam("name") String name){
		return service.readByName(name);
	}
	
	
	
	
	
	

}
