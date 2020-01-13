package com;

public class Subject {
	private String caption;

	 public Subject() {
			
		}

	public Subject(String caption) {
		super();
		this.caption = caption;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Override
	public String toString() {
		return "Subject [caption=" + caption + "]";
	}
	 
}
