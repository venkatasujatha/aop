package com.example.demo.exception;

import org.springframework.http.ResponseEntity;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String message)
	{
		super(message);
	}

}
