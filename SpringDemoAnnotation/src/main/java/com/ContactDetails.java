package com;

public class ContactDetails {
	private String mobileNumber;
	private String emailId;
	
public ContactDetails() {
	// TODO Auto-generated constructor stub
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

@Override
public String toString() {
	return "ContactDetails [mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
}

}
