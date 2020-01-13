package com;

public class To {
	 private String toName;
	 private String toEmail;
	 public To() {
		
	}
	public To(String toName, String toEmail) {
		super();
		this.toName = toName;
		this.toEmail = toEmail;
	}
	public String getToName() {
		return toName;
	}
	public void setToName(String toName) {
		this.toName = toName;
	}
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	
	@Override
	public String toString() {
		return "To [toName=" + toName + ", toEmail=" + toEmail + "]";
	}

}
