package com.java8.unit1;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		StringLengthLambda myLambda = (String s) -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda"));
		
		//Input type yazılmadan da çalışır
		StringLengthLambda myLambda1 = (s) -> s.length();
		System.out.println(myLambda1.getLength("Hello Lambda"));

		//Tek input varsa parantez olmadan da çalışır
		StringLengthLambda myLambda2 = s -> s.length();
		System.out.println(myLambda2.getLength("Hello Lambda"));
		
		//Define yapmadan doğrudan metoda da yollayabiliriz.
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}
	
	
	interface StringLengthLambda{
		int getLength(String s);
	}
}
