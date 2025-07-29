package com.mindgate.main.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorResponseDTO {
	private String apiPath;
	private HttpStatus httpStatus;
	private String errorMessage;
	private LocalDateTime localDateTime;
}
