package com.kun2c.ctci.exam01;

public class Exam01_4 {
	
	public String answer(String letters) {
		
		String result = "";
		
		char[] chars = letters.toCharArray();
		boolean blankFlag = false;
		
		for (char c : chars) {
			if (c == ' ') {
				if (!blankFlag) {
					result += "%20";
				}
				blankFlag = true;
			} else {
				result += c;
				blankFlag = false;
			}
		}
		
		if (blankFlag) {
			result = result.substring(0, result.lastIndexOf("%20"));
		}
		
		return result;
	}
	
	public String answer2(String letters, int length) {
		
		String result = "";
		
		char[] chars = letters.toCharArray();
		
		for (int i=0; i<length; i++) {
			char c = chars[i];
			if (c == ' ') {
				result += "%20";
			} else {
				result += c;
			}
		}
		
		return result;
	}
	
	public String answer3(String letters, int length) {
		
		char[] chars = letters.toCharArray();
		
		int count = 0;
		for (int i=0; i<length; i++) {
			char c = chars[i];
			if (c == ' ') {
				count++;
			}
		}
		
		int newLength = length + count * 2;
		char[] result = new char[newLength];
		
		for (int i=length-1; i>=0; i--) {
			if (chars[i] == ' ') {
				result[newLength - 1] = '0';
				result[newLength - 2] = '2';
				result[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				result[newLength - 1] = chars[i];
				newLength = newLength - 1;
			}
		}
		
		return String.valueOf(result);
	}

}
