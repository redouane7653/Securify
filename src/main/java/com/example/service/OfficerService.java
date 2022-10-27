package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.OfficerNotFoundException;
import com.example.persistance.repository.OfficerRepository;
import com.example.persistance.domain.Officer;
import com.example.rest.dto.OfficerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data

public class OfficerService {
	@Autowired
	private OfficerRepository repo;
	@Autowired
	private ModelMapper mapper;

	private OfficerDTO mapToDTO(Officer officer) {
		return this.mapper.map(officer, OfficerDTO.class);
	}

	public OfficerDTO addOfficer(Officer officer) {
		Officer saved = this.repo.save(officer);
		return this.mapToDTO(saved);
	}

	public List<OfficerDTO> getAllOfficers() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}

	public OfficerDTO updateOfficer(Long id, Officer officer) {
		Optional<Officer> tempOfficer = Optional.of(this.repo.findById(id).orElseThrow(OfficerNotFoundException::new));
		Officer existing = tempOfficer.get();

		existing.setName(officer.getName());
		existing.setLastName(officer.getLastName());
		existing.setDateOfBirth(officer.getDateOfBirth());
		existing.setEmail(officer.getEmail());
		existing.setPhoneNumber(officer.getPhoneNumber());
		existing.setBankDetails(officer.getBankDetails());
		existing.setAdress(officer.getAdress());
		existing.setSiaBadgeNumber(officer.getSiaBadgeNumber());
		existing.setWeeklyAvailability(officer.getWeeklyAvailability());
		existing.setAvailabilityTime(officer.getAvailabilityTime());

		Officer updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}

	public boolean deleteOfficer(Long idOfficer) {
		this.repo.findById(idOfficer).orElseThrow(OfficerNotFoundException::new);
		this.repo.deleteById(idOfficer);
		boolean exists = this.repo.existsById(idOfficer);
		return !exists;
	}

	public OfficerDTO readById(Long idOfficer) {
		Officer found = this.repo.findById(idOfficer).orElseThrow(OfficerNotFoundException::new);
		return this.mapToDTO(found);
	}

	public List<OfficerDTO> readByName(String name) {
		List<Officer> found = this.repo.officerByName(name).orElseThrow(OfficerNotFoundException::new);
		return found.stream().map(this::mapToDTO).collect(Collectors.toList());
	}

}
