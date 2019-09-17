package com.java8.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	/* 
	public static void main(String[] args) {
		int [] someNumbers = {1,2,3,4};
		int key = 2;
		
		process(someNumbers, key);
	}

	private static void process(int[] someNumbers, int key) {
		for (int i:someNumbers) {
			System.out.println(i + key);
		}
	}
	*/
	
	/*
	public static void main(String[] args) {
		int [] someNumbers = {1,2,3,4};
		int key = 2;
		
		process(someNumbers, key, (v, k) -> System.out.println(v + k));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i:someNumbers) {
			consumer.accept(i, key);
		}
	}	
	*/
	
	/*
	 * bu durumda 0 a bölme hatası verecek.
	 * 
	public static void main(String[] args) {
		int [] someNumbers = {1,2,3,4};
		int key = 0;
		
		process(someNumbers, key, (v, k) -> System.out.println(v / k));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i:someNumbers) {
			consumer.accept(i, key);
		}
	}	
	*/
	
	/*
	 * consumer try-catch yapılarak sorun çözülebilir fakat farklı bir kullanımda başka bir exception atabilir.
	 * bu yüzden try-catch bloğunu consumere yazmamak lazım
	 * 
	public static void main(String[] args) {
		int [] someNumbers = {1,2,3,4};
		int key = 0;
		
		process(someNumbers, key, (v, k) -> System.out.println(v / k));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i:someNumbers) {
			try {
				consumer.accept(i, key);
			}
			catch(ArithmeticException e) {
				//_____________
			}
		}
	}	
	*/
	
	/*
	 * tek satırlık lambdamız bozuldu, satır sayısı arttı. bunu da değiştiriyoruz
	 * 
	public static void main(String[] args) {
		int [] someNumbers = {1,2,3,4};
		int key = 0;
		
		process(someNumbers, key, (v, k) ->{
			try {
				System.out.println(v / k);
			}
			catch(ArithmeticException e){
				System.out.println("An Arithmetic Exception happened");
			}
		});
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i:someNumbers) {
			consumer.accept(i, key);
		}
	}	
	*/
	
	/*
	 * WrapperLambda ile exception handlingi ana koddan faklı bir yere almış oluyoruz
	 * */
	public static void main(String[] args) {
		int [] someNumbers = {1,2,3,4};
		int key = 0;
		
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
		
	}


	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i:someNumbers) {
			consumer.accept(i, key);
		}
	}	
	

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			}
			catch(ArithmeticException e) {
				System.out.println("Exception caught in wrapperLambda");
			}
		};
	}
}
