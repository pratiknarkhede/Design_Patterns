package com.pratik.builder;

public class ContactBuilder {
	private String firstName;
	private String LastName;
	private String title;

	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ContactBuilder setLastName(String lastName) {
		this.LastName = lastName;
		return this;
	}

	public ContactBuilder setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public Contact build() {
		return new Contact(firstName, LastName, title);
	}
}
