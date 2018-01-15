package com.confiz.lambda;

public class RunnableWithLambda {

	public static void main(String[] args) {
		
		//Thread implementation through inner class
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable thread");
				
			}
		});
		// run thread
		myThread.run();
		
		//Thread implementation using lambda expression
		Thread myLambdaThread = new Thread(() -> System.out.println("Inside Runnable Lambda thread"));
		
		// run thread
		myLambdaThread.run();
	}

}
