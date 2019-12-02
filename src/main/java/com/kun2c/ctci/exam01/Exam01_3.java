package com.kun2c.ctci.exam01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exam01_3 {

	public boolean answer(String letters1, String letters2) {
		
		char[] longLetters = null;
		char[] shortLetters = null;
		
		if (letters1.length() > letters2.length()) {
			longLetters = letters1.toCharArray();
			shortLetters = letters2.toCharArray();
		} else {
			longLetters = letters2.toCharArray();
			shortLetters = letters1.toCharArray();
		}
		
		int count = shortLetters.length;
		for (char shortLetter : longLetters) {
			for (char longLetter : shortLetters) {
				if (shortLetter == longLetter) {
					count--;
				}
			}
		}
		
		return (count == 0);
	}
	
	public boolean answer2(String letters1, String letters2) {
		
		if (letters1.length() != letters2.length()) {
			return false;
		}
		
		char[] charArr1 = letters1.toCharArray();
		Arrays.sort(charArr1);
		String sortedLetters1 = String.valueOf(charArr1);
		char[] charArr2 = letters2.toCharArray();
		Arrays.sort(charArr2);
		String sortedLetters2 = String.valueOf(charArr2);
		
		return sortedLetters1.equals(sortedLetters2);
	}
	
	public boolean answer3(String letters1, String letters2) {
		
		if (letters1.length() != letters2.length()) {
			return false;
		}
		
		Set<Character> charSet = new HashSet<Character>();
		
		char[] charArr1 = letters1.toCharArray();
		for (char c : charArr1) {
			charSet.add(c);
		}
		
		for (int i=0; i<letters2.length(); i++) {
			char c = letters2.charAt(i);
			if (!charSet.contains(c)) {
				return false;
			}
		}
		
		return true;
	}

}
