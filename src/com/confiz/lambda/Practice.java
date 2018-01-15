package com.confiz.lambda;

public class Practice {
	
	public int add(AddTwoIntegers addTwoIntegers) {
		return addTwoIntegers.foo(4, 3);
	}
	
	

	public static void main(String[] args) {
		Practice practice = new Practice();
		
		System.out.println("Lambda practice");
		
		//lambda expression for adding two integers
		AddTwoIntegers ati = (int a, int b) -> a+b;
		
		//printing on console the result of lambda expression 
		System.out.println(ati.foo(4, 3));
		
		//Anonymous inner class/implementation of AddTwoIntegers Interface
		AddTwoIntegers atiInner = new AddTwoIntegers(){
			public int foo(int a, int b) {
				return a + b;
			}
		};
		
		//printing on console the result of inner class implementation
		System.out.println(atiInner.foo(4, 3));
		
		//printing on console the result of lambda expression Implementation of AddTwoIntegers
		System.out.println(practice.add(ati));
		
		//printing on console the result of lambda expression Type inference
		System.out.println(practice.add((int a, int b) -> a+b));

	}

}
