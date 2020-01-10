package com.kun2c.ctci.exam01;

public class Exam01_8 {

	public boolean answer(String s1, String s2) {
		return isSubstring(s1, s2 + s2);
	}
	
	private boolean isSubstring(String s1, String s2) {
		return s2.indexOf(s1) > -1;
	}

}
