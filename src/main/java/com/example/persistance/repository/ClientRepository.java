package com.example.persistance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistance.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	@Query("Select c from Client c where c.name=?1")
	Optional<Client> clientByName(String name);

}
