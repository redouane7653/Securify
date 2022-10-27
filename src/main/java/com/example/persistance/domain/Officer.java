package com.example.persistance.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Officer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOfficer;
	@NotNull
	@Size(min = 0, max = 55)
	private String name;
	@NotNull
	@Size(min = 0, max = 55)
	private String lastName;
	@NotNull
	private String dateOfBirth;
	@NotNull
	private String email;
	@NotNull
	private Long phoneNumber;
	@NotNull
	private String bankDetails;
	@NotNull
	private String adress;
	@NotNull
	@Size(min = 15, max = 15)
	private Long siaBadgeNumber;
	@NotNull
	private String weeklyAvailability;
	@NotNull
	private String availabilityTime;
	
	@ManyToOne
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
	public void setDateOfBirth(String dateOfBrith) {
		this.dateOfBirth = dateOfBrith;
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
	public Officer(Long idOfficer, String name, String lastName, String dateOfBirth, String email, Long phoneNumber,
			String bankDetails, String adress, Long siaBadgeNumber, String weeklyAvailability,
			String availabilityTime) {
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
	}
	public Officer() {
		super();
	}
	@Override
	public String toString() {
		return "Officer [idOfficer=" + idOfficer + ", name=" + name + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", phoneNumber=" + phoneNumber + ", bankDetails=" + bankDetails
				+ ", adress=" + adress + ", siaBadgeNumber=" + siaBadgeNumber + ", weeklyAvailability="
				+ weeklyAvailability + ", availabilityTime=" + availabilityTime + "]";
	}

	
	
	

}
