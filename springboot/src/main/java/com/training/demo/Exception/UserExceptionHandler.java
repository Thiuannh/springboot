package com.training.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class UserExceptionHandler {
	@ExceptionHandler(NotFountException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse HandlerNotFountException(NotFountException notFountException, WebRequest webRequest) {
		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND, notFountException.getMessage());
//		return new ErrorResponse(HttpStatus.NOT_FOUND, notFountException.getMessage());
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notFountException.getMessage());
		return errorResponse;
	}
	
	
	@ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleAllException(Exception ex, WebRequest request) {
		
        return new ErrorResponse(HttpStatus.NOT_FOUND, ex.getLocalizedMessage());
    }
	


}
