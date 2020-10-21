package com.knowledgewala.interviewqa;

import java.util.Stack;

public class KWBalanceBracketDemo {
	public static void main(String[] args) {
		System.out.println("Balanced Bracket Problem");
		String s = "({[})";
		
		System.out.println(isBalance(s));

	}

	public static String isBalance(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return "No";
				} else {
					char pop_val = stack.pop();

					if (s.charAt(i) == ')' && pop_val != '(') {
						return "No";
					} else if (s.charAt(i) == '}' && pop_val != '{') {
						return "No";
					} else if (s.charAt(i) == ']' && pop_val != '[') {
						return "No";
					}
				}
			}

		}
		if(stack.isEmpty()) {
			return "Yes";			
		}else {
			return "No";
		}
	}

}
