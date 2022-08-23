package com.example.demo.exception;

import java.util.Date;

import javax.naming.InsufficientResourcesException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	//handle specific exceptions
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public <T> ResponseEntity<?> ResourceNotFoundException(ResourceNotFoundException foundException,WebRequest webRequest)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), foundException.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(APIException.class)
	public ResponseEntity<?> APIException(APIException apiException,WebRequest webRequest)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), apiException.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(InSufficientDataStorageException.class)
	public ResponseEntity<?> InSufficientDataStorageException(InSufficientDataStorageException dataStorageException,WebRequest webRequest)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), dataStorageException.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity(errorDetails, HttpStatus.INSUFFICIENT_STORAGE);
	}
	@ExceptionHandler(InsufficientResourcesException.class)
	public ResponseEntity<?> InSufficientResourcesException(InsufficientResourcesException insufficientResourcesException,WebRequest webRequest)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), insufficientResourcesException.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity<>(errorDetails,HttpStatus.INSUFFICIENT_STORAGE);
	}
	//handle global exceptions
	
	public <T> ResponseEntity<?> Exception(Exception exception,WebRequest webRequest)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(), exception.getMessage(), webRequest.getDescription(false));
		return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	

}
