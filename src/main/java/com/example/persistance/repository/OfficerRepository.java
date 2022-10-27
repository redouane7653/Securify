package com.example.persistance.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.persistance.domain.Officer;

public interface OfficerRepository extends JpaRepository<Officer, Long> {
	@Query("select o from Officer o where o.name=?1")
	Optional<List<Officer>> officerByName(String name);

}
