package com.capgemini.shopping.exceptions;

public class AuthenticationFailException extends IllegalArgumentException  {
	  public AuthenticationFailException(String msg){
	        super(msg);
	    }

}
