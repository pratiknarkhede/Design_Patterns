package com.pratik.builder;

public class TestContactBuilder {

	public static void main(String[] args) {	
		
		
		ContactBuilder contactBuilder1 = new ContactBuilder();
		Contact contact1 = contactBuilder1.setFirstName("Himmat").setLastName("singh").setTitle("Captain")

				.build();

		ContactBuilder contactBuilder2 = new ContactBuilder();
		//we dont need to worry about setting any field null now 
		Contact contact2 = contactBuilder2.setFirstName("Himmat").setLastName("singh").build();
		
		
		// in absense of builder we must remember all the fields and set those as null which we dont want for object construction
		
		Contact contact3=new Contact("Sidhhant", "Reuter", null);

		System.out.println(contact1.toString());
		System.out.println(contact2.toString());
		System.out.println(contact3.toString());
	}

}
