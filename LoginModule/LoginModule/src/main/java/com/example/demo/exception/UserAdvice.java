package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/****************************
 *          @author          Prateek Pandey
 *          Description      It is a Custom Exception Controller class to handle all the exceptions.
                                         
  *         Version          1.0
  *         Created Date     13-May-2020
 ****************************/


@RestControllerAdvice
public class UserAdvice {
	
	@ExceptionHandler(value= {UserException.class})
	public ResponseEntity<String> handleException(Exception ex) {
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
