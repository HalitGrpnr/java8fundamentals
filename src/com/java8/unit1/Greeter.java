package com.java8.unit1;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		
		//functional interfacemizi lambda ile kullanım şekli		
		Greeting lambdaGreeting = () -> System.out.println("Hello World from lambdaGreeting");
		
		//functional interfacemizi anonymous inner class ile kullanım şekli
		Greeting innerClassGreeting = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World from innerClass Greeting");
				
			}
		};
		
		//üç kullanımın da sonucu aynı. java 8 lambda ile daha okunabilir ve performanslı bir kod sağlıyor
		//lambda inner class'ta olduğu gibi bir class create etmez. function create eder
		
		helloWorldGreeting.perform();
		lambdaGreeting.perform();
		innerClassGreeting.perform();
		System.out.println("////////////////////");
		greeter.greet(helloWorldGreeting);
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		
	}

}

/* lambda expressions step-by-step:
 * 
 * 1)
 * lambdaGreeting = public void perform(){
 * 		System.out.println("Hello world from lambda");
 * }
 * 
 * 2)
 * lambda kullanımında access modifier kullanımına gerek olmaz:
 * 
 * lambdaGreeting = void perform(){
 * 		System.out.println("Hello world from lambda");
 * }
 * 
 * 3)
 * lambda kullanımında metod ismine gerek olmaz:
 * 
 * lambdaGreeting = void (){
 * 		System.out.println("Hello world from lambda");
 * }
 * 
 * 4)
 * lambda kullanımında return type kullanımına gerek olmaz, compiler kendisi tespit eder.
 * metodu lambdaya assign etmek için " -> " operationu kullanılır
 * 
 * lambdaGreeting = () -> {
 * 		System.out.println("Hello world from lambda");
 * }
 * 
 * 5)
 * lambda kullanımında kodumuz tek satırsa süslü paranteze de gerek olmaz:
 * 
 * lambdaGreeting = () -> System.out.println("Hello world from lambda");
 * 
 * */



