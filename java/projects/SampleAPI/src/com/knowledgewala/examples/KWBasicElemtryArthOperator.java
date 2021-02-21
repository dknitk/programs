package com.knowledgewala.examples;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * This class helps to understand elementary arithmetic operator.
 * @author dknitk
 *
 */
public class KWBasicElemtryArthOperator {

	//Logger Object
	final static Logger LOGGER = LoggerFactory.getLogger(KWBasicElemtryArthOperator.class);

	/**
	 * This method helps sum of two numbers.
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double sum(double num1, double num2) {

		return num1 + num2;
	}

	/**
	 * This method helps subtraction of two numbers.
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double substract(double num1, double num2) {

		return num1 - num2;
	}
	/**
	 * This method helps multiplication of two numbers.
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double multiple(double num1, double num2) {

		return num1 * num2;
	}
	/**
	 * This method helps division of two numbers.
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double divide(double num1, double num2) {

		return num1/num2;
	}

	/**
	 * This main method helps to execute the program.
	 *  Please enter two numbers.
	 *  Please enter Arithmetic Operator like + , -, *, /
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.info("Entering into Main method *****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter First number :");
		double num1 = sc.nextDouble();
		System.out.println("Please enter Second number :");
		double num2 = sc.nextDouble();

		System.out.println("Please enter Arithmatic Operation like +,-,*,/ :");
		String opterator = sc.next();

		KWBasicElemtryArthOperator arthOperator = new KWBasicElemtryArthOperator();
		switch (opterator) {
		case "+":
			System.out.println("The Sum of num1 & num2 is: "+ arthOperator.sum(num1, num2));
			break;
		case "-":
			System.out.println("The Substraction of num1 & num2 is: "+ arthOperator.substract(num1, num2));
			break;
		case "*":
			System.out.println("The Multiplication of num1 & num2 is: "+ arthOperator.multiple(num1, num2));
			break;
		case "/":
			System.out.println("The Division of num1 & num2 is: "+ arthOperator.divide(num1, num2));
			break;
		default: throw new IllegalAccessError();
		}

		LOGGER.info("Exiting from Main method *****");
	}

}
