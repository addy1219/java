package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception
{
	@SuppressWarnings("unused")
	private static final int serialVersionUID=1;
	
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
}