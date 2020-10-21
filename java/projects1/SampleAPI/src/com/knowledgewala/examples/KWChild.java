package com.knowledgewala.examples;

import java.io.FileNotFoundException;

public class KWChild extends KWParent{
	// Covariant Type Example
	public B print(){
		System.out.println("Print from the Child Class!");
		
		return new B();
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("HelloOverride Method!");
		
		KWParent p = new KWParent();
		p.print();
		
		KWParent p2 = new KWChild();
		p2.print();
		
		KWChild ch = new KWChild();
		ch.print();
		
			
	}

}
