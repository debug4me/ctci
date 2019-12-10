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
	
	public String answer2(String letters) {
		
		int size = countCompression(letters);
		if (size >= letters.length()) {
			return letters;
		}
		
		StringBuffer sb = new StringBuffer();
		
		char[] chars = letters.toCharArray();
		char previous = ' ';
		int count = 0;
		
		for (char c : chars) {
			if (c == previous) {
				count++;
			} else {
				if (count > 0) {
					sb.append(previous).append(count);
				}
				previous = c;
				count = 1;
			}
		}
		sb.append(previous).append(count);
		
		return sb.toString();
	}
	
	private int countCompression(String str) {
		
		int size = 0;
		
		char[] chars = str.toCharArray();
		char previous = ' ';
		int count = 0;
		
		for (char c : chars) {
			if (c == previous) {
				count++;
			} else {
				if (count > 0) {
					size += 1 + String.valueOf(count).length();
				}
				previous = c;
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		
		return size;
	}

}
