package com.knowledgewala.examples;

import java.io.FileNotFoundException;

public class KWParent {
	
	public A print() throws FileNotFoundException{
		System.out.println(" Print from the parent");
		
		return new A();
	}
}
