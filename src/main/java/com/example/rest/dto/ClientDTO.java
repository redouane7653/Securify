package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.persistance.domain.Officer;
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class ClientDTO {

	private Long idClient;
	private String name;
	private String lastName;
	private String dateOfBrith;
	private String email;
	private Long phoneNumber;
	private String adress;
	private String paymentDetails;
	private Long siaBadgeNumber;
	private String bookingDateAndTime;

	private List<Officer> officers = new ArrayList<>();

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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

	public String getDateOfBrith() {
		return dateOfBrith;
	}

	public void setDateOfBrith(String dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public Long getSiaBadgeNumber() {
		return siaBadgeNumber;
	}

	public void setSiaBadgeNumber(Long siaBadgeNumber) {
		this.siaBadgeNumber = siaBadgeNumber;
	}

	public String getBookingDateAndTime() {
		return bookingDateAndTime;
	}

	public void setBookingDateAndTime(String bookingDateAndTime) {
		this.bookingDateAndTime = bookingDateAndTime;
	}

	public List<Officer> getOfficers() {
		return officers;
	}

	public void setOfficers(List<Officer> officers) {
		this.officers = officers;

	}
	
	

	public ClientDTO(Long idClient, String name, String lastName, String dateOfBrith, String email, Long phoneNumber,
			String adress, String paymentDetails, Long siaBadgeNumber, String bookingDateAndTime,
			List<Officer> officers)

	{
		super();
		this.idClient = idClient;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBrith = dateOfBrith;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.paymentDetails = paymentDetails;
		this.siaBadgeNumber = siaBadgeNumber;
		this.bookingDateAndTime = bookingDateAndTime;
		this.officers = officers;
	}

	public ClientDTO() {
		super();
	}

	@Override
	public String toString() {
		return "ClientDTO [idClient=" + idClient + ", name=" + name + ", lastName=" + lastName + ", dateOfBrith="
				+ dateOfBrith + ", email=" + email + ", phoneNumber=" + phoneNumber + ", adress=" + adress
				+ ", paymentDetails=" + paymentDetails + ", siaBadgeNumber=" + siaBadgeNumber + ", bookingDateAndTime="
				+ bookingDateAndTime + ", officers=" + officers + "]";
	}
	
	
}
