package com.in28minutes.rest.controllers.bean;

public class HelloWorldBean {

//	@JsonIgnore
	private String message;

	public HelloWorldBean(String message) {
		this.setMessage(message);
	}

//	No converter found for return value of type: class com.in28minutes.rest.controllers.HelloWorldBean
//	Will come when there is no getter available
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
