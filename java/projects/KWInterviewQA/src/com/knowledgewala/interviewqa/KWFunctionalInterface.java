package com.knowledgewala.interviewqa;

import sun.util.logging.resources.logging;

public class KWFunctionalInterface implements MyInterface1, MyInterface2 {

	public static void main(String[] args) {
		
		KWFunctionalInterface kwFunctionalInterface = new KWFunctionalInterface();
		kwFunctionalInterface.log("Hello My String");
		MyInterface1.print("Hello Method from interface 1");
		MyInterface2.print("Hello Method from interface 2");
		
		MyInterface2 myInterface2 = new KWFunctionalInterface();
		myInterface2.log("Hello From Interface2");
		
		MyInterface2.print("Hello From Interface");
		
		MyInterface1.print("Hello From Interface");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	public void log(String str) {
		
		System.out.println("Log stored through Class KWFunctionalInterface::"+str);
	}

}
