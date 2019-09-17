package com.java8.unit1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Person {
	public @Getter @Setter String firstName;
	public @Getter @Setter String lastName;
	public @Getter @Setter int age;


	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
