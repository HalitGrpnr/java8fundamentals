package com.java8.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.unit1.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Caroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
  
		/* Metod 1 parametre alıp onu kullanıyorsa da metod reference kullanılabilir
		 * p -> System.out.println(p)  == System.out::println
		 * */
		
		System.out.println("Printing all People");
		printConditionally(people, p -> true, System.out::println);
		
		
	}

 
	//Predicate Interface test metoduna sahip Standart bir functionalInterface'dir, 
	//Condition diye oluşturmadan bunu kullanabiliriz.
	//Consumer da standart functionalInterfacelerden. Yapılacak işi de bununla yolladık. 
	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
		
	}
}
