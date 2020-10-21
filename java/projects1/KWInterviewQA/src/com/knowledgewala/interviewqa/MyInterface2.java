package com.knowledgewala.interviewqa;

public interface MyInterface2 {

	void method2();

	default void log(String str) {
		System.out.println("MyInterface2 Log stored are :" + str);
	}

	static void print(String str) {
		System.out.println("MyInterface2 String Printed is ::" + str);
	}

}