package com.knowledgewala.interviewqa;

public interface MyInterface1 {

	void method1();

	default void log(String str) {
		System.out.println("MyInterface1 Log stored are :" + str);
	}

	static void print(String str) {
		System.out.println("MyInterface1 String Printed is ::" + str);
	}

}