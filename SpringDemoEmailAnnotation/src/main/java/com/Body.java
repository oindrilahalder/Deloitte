package com;

public class Body {
	private String message;

	 public Body() {
			
		}

	public Body(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Body [message=" + message + "]";
	}
	 

}
