package com.example.demo.exception;

/****************************
 *          @author          Prateek Pandey
 *          Description      It is a Custom Exception class which extends exception.
                                         
  *         Version          1.0
  *         Created Date     13-May-2020
 ****************************/


public class UserException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UserException(String s) {
		super(s);
	}
}