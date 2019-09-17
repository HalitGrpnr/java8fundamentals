package com.java8.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> printMessage());
		t1.start();
		
		Thread t2 = new Thread(MethodReferenceExample1::printMessage);
		t2.start();
		
		/*
		 * no parameter and just execute method
		 * bu durumda lambdaya alternatif olarak bu syntax kullanılabilir. 
		 * Buna method reference denir
		 * () -> printMessage()  == MethodReferenceExample1::printMessage
		 */
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
