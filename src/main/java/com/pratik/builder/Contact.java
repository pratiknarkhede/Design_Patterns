package com.pratik.builder;

public class Contact {
	private String firstName;
	private String LastName;
	private String title;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Contact(String firstName, String lastName, String title) {

		this.firstName = firstName;
		this.LastName = lastName;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", LastName=" + LastName + ", title=" + title + "]";
	}
	
	

}
