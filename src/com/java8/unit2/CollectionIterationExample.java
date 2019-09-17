package com.java8.unit2;

import java.util.Arrays;
import java.util.List;

import com.java8.unit1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Caroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		// bu iki for döngüsü external iterators olarak adlandırılır
		System.out.println("Using for loop");
		for (int i=0; i<people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for each loop");
		for (Person p:people) {
			System.out.println(p);
		}
		
		// internal iterator
		/*java 8 den sonra Collections'a bir metod daha eklendi. forEach(), bu metodla listeyi döngüye alıyoruz. 
		 * forEach() parametre olarak generic bir Consumer<?> interfacesi alır
		 * Consumer java 8 ile gelen standart bir functional interfacedir. bunun metodunu eziyoruz
		 */
		System.out.println("Using lambda for each loop");
		people.forEach(p -> System.out.println(p));
		
		System.out.println("Using method reference for each loop");
		people.forEach(System.out::println);
		
	}

}
