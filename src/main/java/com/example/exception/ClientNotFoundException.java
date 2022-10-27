package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Band does not exist with that ID")
public class ClientNotFoundException extends EntityNotFoundException{
	public ClientNotFoundException() {}
	public ClientNotFoundException(String msg) {
		super(msg);
	}

}
