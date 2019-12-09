package com.kun2c.ctci.exam01;

public class Exam01_5 {
	
	public String answer(String letters) {
		
		String result = "";
		
		char[] chars = letters.toCharArray();
		char previous = ' ';
		int count = 0;
		
		for (char c : chars) {
			if (c == previous) {
				count++;
			} else {
				if (count > 0) {
					result += String.valueOf(previous);
					result += count;
				}
				previous = c;
				count = 1;
			}
		}
		result += String.valueOf(previous) + count;
		
		return (letters.length() <= result.length()) ? letters : result ;
	}

}
