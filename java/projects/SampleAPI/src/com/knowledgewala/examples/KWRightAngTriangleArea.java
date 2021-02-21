package com.knowledgewala.examples;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This program helps to calculate the area of a right angle triangle. // Area
 * if Triangle = (Base X Height)/2;
 * 
 * @author dknitk
 *
 */
class KWRightAngTriangleArea {
	// Logger Object
	final static Logger LOGGER = LoggerFactory.getLogger(KWCurrencyConvertApp.class);

	private double area(double base, double height) {

		return (base * height) / 2;
	}

	/**
	 * This main method helps to execute the program.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		LOGGER.info("Entering into Main method *****");
		double base, height;

		KWRightAngTriangleArea angTriangleArea = new KWRightAngTriangleArea();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of base of Triangle");
		base = in.nextDouble();

		System.out.println("Enter length if height of Triangle");
		height = in.nextDouble();

		System.out.println("Area of Triangle = " + angTriangleArea.area(base, height));
		LOGGER.info("Exiting from Main method *****");
	}
}