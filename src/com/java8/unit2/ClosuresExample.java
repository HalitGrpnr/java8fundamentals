package com.java8.unit2;

public class ClosuresExample {

	/*
	 * closure: A closure is a block of code 
	 * that can be referenced (and passed around) 
	 * with access to the variables of the enclosing scope.
	 */
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		/*
		 * java8 den önce inner classta b yi kullanmak için final tanımlamak gerekiyordu
		 * java8 diyor ki final tanımlamana gerek yok kullanabilirsin, ben hafızaya attım onu
		 * ama b yi değiştirmeme garantisi vereceksin. değiştirirsen final yaz diye uyarırım
		 */
		doProcess(a, new Process() {
			
			@Override
			public void process(int i) {
				//b = 20; yazınca final tanımla diye uyarır. değiştirmeye izin yok
				System.out.println( i  + b);
			}
		});
		
		//lambda ile de inner'ta olduğu gibi b kullanılabilir 
		doProcess(a, i -> System.out.println(i+b));
	}
	
	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process{
	void process(int i);
}