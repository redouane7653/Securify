package com.example.rest.dto;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.persistance.domain.Client;



//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class OfficerDTO {
	
	private Long idOfficer;
	private String name;
	private String lastName;
	private String dateOfBirth;
	private String email;
	private Long phoneNumber;
	private String bankDetails;
	private String adress;
	private Long siaBadgeNumber;
	private String weeklyAvailability;
	private String availabilityTime;	
	private Client client;
	public Long getIdOfficer() {
		return idOfficer;
	}
	public void setIdOfficer(Long idOfficer) {
		this.idOfficer = idOfficer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(String bankDetails) {
		this.bankDetails = bankDetails;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Long getSiaBadgeNumber() {
		return siaBadgeNumber;
	}
	public void setSiaBadgeNumber(Long siaBadgeNumber) {
		this.siaBadgeNumber = siaBadgeNumber;
	}
	public String getWeeklyAvailability() {
		return weeklyAvailability;
	}
	public void setWeeklyAvailability(String weeklyAvailability) {
		this.weeklyAvailability = weeklyAvailability;
	}
	public String getAvailabilityTime() {
		return availabilityTime;
	}
	public void setAvailabilityTime(String availabilityTime) {
		this.availabilityTime = availabilityTime;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public OfficerDTO(Long idOfficer, String name, String lastName, String dateOfBirth, String email, Long phoneNumber,
			String bankDetails, String adress, Long siaBadgeNumber, String weeklyAvailability, String availabilityTime,
			Client client) {
		super();
		this.idOfficer = idOfficer;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.bankDetails = bankDetails;
		this.adress = adress;
		this.siaBadgeNumber = siaBadgeNumber;
		this.weeklyAvailability = weeklyAvailability;
		this.availabilityTime = availabilityTime;
		this.client = client;
	}
	public OfficerDTO() {
		super();
	}
	@Override
	public String toString() {
		return "OfficerDTO [idOfficer=" + idOfficer + ", name=" + name + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", phoneNumber=" + phoneNumber + ", bankDetails=" + bankDetails
				+ ", adress=" + adress + ", siaBadgeNumber=" + siaBadgeNumber + ", weeklyAvailability="
				+ weeklyAvailability + ", availabilityTime=" + availabilityTime + ", client=" + client + "]";
	}
	
	

	
}
