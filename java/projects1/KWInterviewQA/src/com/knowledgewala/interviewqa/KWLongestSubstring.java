package com.knowledgewala.interviewqa;

import java.util.HashSet;
import java.util.Set;

public class KWLongestSubstring {

	public static void main(String[] args) {

		String str = "abcabcbb";
		longestSubtring(str);

	}

	public static String longestSubtring(String originalString) {

		int index = 0;
		Set<String> set = new HashSet<String>();

		Set<String> finalSet = new HashSet<String>();

		int i = 0;

		while (i < originalString.length()) {
			
			String str = originalString.charAt(i) + "";

			if (!set.contains(str)) {
				set.add(str);
				i++;

			} else {

				finalSet.add(originalString.substring(index, i));
				System.out.println("SubString ::: " + originalString.substring(index, i));
				index = originalString.indexOf(str)+1;

				set.clear();
				i = index;

			}

		}
		return "";
	}

}
