package com.knowledgewala.interviewqa;

public class KWLambdaExpression {

	public static void main(String[] args) {
		System.out.println("Hello Inside Main method");

		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("Traditional Way of Implementation!!");
			}
		};

		// Lambda Functional Expression
		Runnable runnable1 = () -> {
			System.out.println("Lambda Way of Implementation!!");
		};
		// Traditional Way of Implementation
		Thread t1 = new Thread(runnable);
		t1.start();
		// Lambda Way of Implementation
		Thread t2 = new Thread(runnable1);
		t2.start();

	}

}
