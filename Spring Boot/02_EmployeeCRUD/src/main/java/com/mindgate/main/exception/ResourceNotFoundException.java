package com.mindgate.main.exception;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(String resourceName, String fieldName, String value) {
		super(resourceName + " Not Found With " + fieldName + " : " + value);
	}
}
