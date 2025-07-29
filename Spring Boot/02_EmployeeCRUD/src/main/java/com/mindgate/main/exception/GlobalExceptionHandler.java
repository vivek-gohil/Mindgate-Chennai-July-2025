package com.mindgate.main.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mindgate.main.dto.ErrorResponseDTO;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		List<ObjectError> errors = ex.getAllErrors();
		Map<String, String> validationErrors = new HashMap<>();

		for (ObjectError objectError : errors) {
			FieldError fieldError = (FieldError) objectError;
			String field = fieldError.getField();
			String message = fieldError.getDefaultMessage();
			validationErrors.put(field, message);
		}

	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationErrors);
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponseDTO> handleResourceNotFoundDTO(
			ResourceNotFoundException resourceNotFoundException, WebRequest webRequest) {

		ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(webRequest.getDescription(false), HttpStatus.NOT_FOUND,
				resourceNotFoundException.getMessage(), LocalDateTime.now());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponseDTO);
	}

}
