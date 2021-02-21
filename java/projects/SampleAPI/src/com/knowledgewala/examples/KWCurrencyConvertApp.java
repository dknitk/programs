package com.knowledgewala.examples;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This program helps to calculate the currency based on conversion rate.
 * 
 * @author dknitk
 *
 */
public class KWCurrencyConvertApp {

	// Logger Object
	final static Logger LOGGER = LoggerFactory.getLogger(KWCurrencyConvertApp.class);

	/**
	 * This method helps to convert amount based on conversion rate. Please passed
	 * the conversion rate as a input.
	 * 
	 * @param totalSrcAmount
	 * @param conversionRate
	 * @return double
	 */
	private double convertAmount(double totalSrcAmount, double conversionRate) {

		return totalSrcAmount * conversionRate;
	}

	/**
	 * This main method helps to execute the program.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		LOGGER.info("Entering into Main method *****");
		KWCurrencyConvertApp kwCurrencyConvertApp = new KWCurrencyConvertApp();

		double totalSrcAmount, conversionRate;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total Amount to convert:");
		totalSrcAmount = in.nextDouble();
		System.out.println("Enter conversion Rate:");
		conversionRate = in.nextDouble();

		System.out.println("Target Source Amount =" + totalSrcAmount + " is Converted Amount ="
				+ kwCurrencyConvertApp.convertAmount(totalSrcAmount, conversionRate));
		LOGGER.info("Exiting from Main method *****");
	}

}
