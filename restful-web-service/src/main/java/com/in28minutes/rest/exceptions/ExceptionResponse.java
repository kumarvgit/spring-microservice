package com.in28minutes.rest.exceptions;

import java.util.Date;

public class ExceptionResponse extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2243775389481615503L;

	private Date timestamp;

	private String message;

	private String details;

	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
