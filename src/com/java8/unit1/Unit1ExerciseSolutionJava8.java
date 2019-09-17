package com.java8.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Caroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		// Step 1: Sort list by last name	
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		

		// Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all People");
		printConditionally(people, p -> true);
		
		
		// Step 3: Create a method that prints all people that have last name beginning with C 
		System.out.println("Printing all People whose last name beginning with C");
		printLastNameBeginningWithC(people);
		
		
		System.out.println("Printing all People whose last name beginning with C");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		System.out.println("Printing all People whose first name beginning with C");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
		
		System.out.println("Printing all People whose first name beginning with C");
		printConditionally2(people, p -> p.getFirstName().startsWith("C"));
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}
	
	//Predicate Interface test metoduna sahip Standart bir functionalInterface'dir, 
	//Condition diye oluşturmadan bunu kullanabiliriz.
	private static void printConditionally2(List<Person> people, Predicate<Person> predicate) {
		for(Person p : people) {
			if (predicate.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	// D ile başlayanları yazdır denilince yeni bir metoda ihtiyaç duyulacak !!!!	
	private static void printLastNameBeginningWithC(List<Person> people) {
		for(Person p : people) {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		}
		
	} 

}
