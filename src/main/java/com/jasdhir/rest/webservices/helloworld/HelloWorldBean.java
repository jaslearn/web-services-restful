package com.jasdhir.rest.webservices.helloworld;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HelloWorldBean {
	private String message;

	/*
	 * public HelloWorldBean(String message) { this.message = message; }
	 * 
	 * public String getMessage() { return message; }
	 * 
	 * public void setMessage(String message) { this.message = message; }
	 * 
	 * @Override public String toString() { return
	 * String.format("HelloWorldBean [message=%s]", message); }
	 */

}
