package com.knowledgewala.examples;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This program helps to convert temperature from celsius to fahrenheit and vise
 * vera.
 * 
 * Formula: (32F − 32) × 5/9 = 0C Input f for Fahrenheit and c for Celsius
 * 
 * @author dknitk
 *
 */
public class KWConvertTemprature {
	// Logger Object
	final static Logger LOGGER = LoggerFactory.getLogger(KWBasicElemtryArthOperator.class);

	/**
	 * This method helps to convert celsius to fahrenheit.
	 * 
	 * @param temp
	 * @return double
	 */
	public double convertCelToFahren(double temp) {

		return (9 * temp) / 5 + 32;

	}

	/**
	 * This method helps to convert fahrenheit to celsius.
	 * 
	 * @param temp
	 * @return double
	 */
	public double convertFahrenToCel(double temp) {

		return (temp - 32) * (5 / 9);
	}

	/**
	 * This main method helps to execute the program. Please enter temperature which
	 * you want to convert. Please enter Arithmetic Operator like f or c
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Entering into Main method *****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the temprature :");
		double temp = sc.nextDouble();

		System.out.println("Please enter temprature conversion like f or c:");
		String opterator = sc.next();

		KWConvertTemprature convertTempObj = new KWConvertTemprature();

		switch (opterator) {
		case "f":
			System.out.println("The Converted Temrature is: " + convertTempObj.convertCelToFahren(temp));
			break;
		case "c":
			System.out.println("The Converted Temrature is: " + convertTempObj.convertFahrenToCel(temp));
			break;
		case "F":
			System.out.println("The Converted Temrature is: " + convertTempObj.convertCelToFahren(temp));
			break;
		case "C":
			System.out.println("The Converted Temrature is: " + convertTempObj.convertFahrenToCel(temp));
			break;
		default:
			System.out.println("The entered value is not a valid one. Please enter f or c.");
			throw new IllegalAccessError();
		}

		LOGGER.info("Exiting from Main method *****");
	}

}
