package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class JavaStreams {

	public static void main(String[] args) {
		
		// 1. Integer Stream: [1-10) arası sayıları ekrana yazdırır 
		System.out.println("[1-10) arası sayıları ekrana yazar");
		
		IntStream.range(1, 10)
		.forEach(System.out::print);
		
		System.out.println();
		
		// 2. Integer Stream with skip: ilk 5 elemanı geçer [6,10) arası yazar
		System.out.println("ilk 5 elemanı geçer [6,10) arası ekrana yazar");
		
		IntStream.range(1, 10)
		.skip(5)
		.forEach(System.out::print);
		
		System.out.println();
		
		// 3. Integer Stream with sum
		System.out.println("1-5 arası sayıların toplamı");
		
		System.out.println(IntStream.range(1,5).sum());
		
		System.out.println();
		
		// 4. Stream.of sorted and findFirst
		System.out.println("Stream.of sorted and findFirst");
		
		Stream.of("Ava", "Aneri", "Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		System.out.println();
		
		// 5. Stream from Array, sort, filter and print
		System.out.println("Stream from Array, sort, filter and print");
		
		String names[] = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah"};
		
		Arrays.stream(names)  //same as Stream.of(names)
		.filter(x -> x.startsWith("S"))
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		
		// 6. avarage of squares of an int array
		
		System.out.println("Avarage of squares of an int array");
		
		Arrays.stream(new int [] {2,4,6,8,10})
		.map(x -> x*x)
		.average()
		.ifPresent(System.out::println);
		
		System.out.println();
		
		// 7. Stream from List, filter and Print
		
		List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah");
		
		people.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("a"))
		.forEach(System.out::println);
		
		System.out.println();
		
		// 8. Collector
		List<String> people2 = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika", "Sarah");
		
		people2 = people2.stream()
		.map(String::toLowerCase)
		.filter(x -> x.contains("an"))
		.collect(Collectors.toList());
		
		people2.forEach(System.out::println);
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
