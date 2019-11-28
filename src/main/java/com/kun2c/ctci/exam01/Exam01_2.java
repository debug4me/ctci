package com.kun2c.ctci.exam01;

public class Exam01_2 {

	public String answer(String letters) {
		
		if (letters.length() < 2) {
			return letters;
		}
		
		char[] reverse = letters.toCharArray();
		
		for (int i=0; i<reverse.length; i++) {
			
			int rearIndex = reverse.length - 1 - i;
			if (i >= rearIndex) {
				break;
			}
			
			char front = reverse[i];
			char rear = reverse[rearIndex];
			
			reverse[rearIndex] = front;
			reverse[i] = rear;
		}
		
		return String.valueOf(reverse);
	}

}
