package com.java8.unit1;

/**
 * interfacemizi implement eden classımız
 * @author halit-ce
 *
 */
public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World from helloWorldGreeting");		
	}

}
