package com.kun2c.ctci.exam01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.kun2c.ctci.exam01.Exam01_1;

/*
 * 1.1
 * 문자열에 포함된 문자들이 전부 유일한지를 검사하는 알고리즘을 구현하라.
 * 다른 자료구조를 사용할 수 없는 상황이라면 어떻게 하겠는가?
 */
public class Exam01_1Test {
	
	@Test
	public void testAnswer() {		
		Exam01_1 exam = new Exam01_1();
		
		boolean result = exam.answer("abcdef");
		assertTrue(result);
		
		boolean result2 = exam.answer("abddef");
		assertFalse(result2);
	}
	
	@Test
	public void testAnswer2() {
		Exam01_1 exam = new Exam01_1();
		
		boolean result = exam.answer2("abcdef");
		assertTrue(result);
		
		boolean result2 = exam.answer2("abddef");
		assertFalse(result2);
	}
	
	@Test
	public void testAnswer3() {
		Exam01_1 exam = new Exam01_1();
		
		boolean result = exam.answer3("abcdef");
		assertTrue(result);
		
		boolean result2 = exam.answer3("feddba");
		assertFalse(result2);
	}

}
