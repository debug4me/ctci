package com.kun2c.ctci.exam01;

import java.util.HashSet;

public class Exam01_1 {

	public boolean answer(String letters) {
		
		HashSet<Character> set = new HashSet<Character>();
		
		for (int i=0; i<letters.length(); i++) {
			char letter = letters.charAt(i);
			if (set.contains(letter)) {
				return false;
			} else {
				set.add(letter);
			}
		}
		
		return true;
	}
	
	public boolean answer2(String letters) {
		
		for (int i=0; i<letters.length(); i++) {
			for (int j=0; j<letters.length(); j++) {
				if (i != j) {
					if (letters.charAt(i) == letters.charAt(j)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	public boolean answer3(String letters) {
		
		char[] letterArray = letters.toCharArray();
		
		for (int i=0; i<letterArray.length; i++) {
			for (int j=i+1; j<letterArray.length; j++) {
				if (letterArray[i] > letterArray[j]) {
					char temp = letterArray[i];
					letterArray[i] = letterArray[j];
					letterArray[j] = temp;
				}
			}
		}
		
		for (int i=0; i<letterArray.length-1; i++) {
			if (letterArray[i] == letterArray[i+1]) {
				return false;
			}
		}
		
		return true;
	}

}
