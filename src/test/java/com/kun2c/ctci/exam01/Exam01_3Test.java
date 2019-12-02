package com.kun2c.ctci.exam01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * 1.3
 * 문자열 두 개를 입력으로 받아 그중 하나가 다른 하나의 순열인지 판별하는 메서드를 작성하라.
 */
public class Exam01_3Test {

	@Test
	public void testAnswer() {
		Exam01_3 exam = new Exam01_3();
		
		boolean result = exam.answer("abcd", "abc");
		assertTrue(result);
		
		boolean result2 = exam.answer("cde", "abcd");
		assertFalse(result2);
	}
	
	@Test
	public void testAnswer2() {
		Exam01_3 exam = new Exam01_3();
		
		boolean result = exam.answer2("abcd", "dcba");
		assertTrue(result);
		
		boolean result2 = exam.answer2("abcd", "edcb");
		assertFalse(result2);
	}
	
	@Test
	public void testAnswer3() {
		Exam01_3 exam = new Exam01_3();
		
		boolean result = exam.answer3("abcd", "bcda");
		assertTrue(result);
		
		
		boolean result2 = exam.answer3("abcd", "bcde");
		assertFalse(result2);
	}

}
