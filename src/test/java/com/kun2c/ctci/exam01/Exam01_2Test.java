package com.kun2c.ctci.exam01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * 1.2
 * 널 문자로 끝나는 문자열을 뒤집는 reverse(char* str) 함수를 C나 C++로 구현하라.
 */
public class Exam01_2Test {
	
	@Test
	public void testAnswer() {		
		Exam01_2 exam = new Exam01_2();
		
		String result = exam.answer("ab");
		assertEquals("ba", result);
		
		String result2 = exam.answer("abc");
		assertEquals("cba", result2);	
	}

}
