package com.kun2c.ctci.exam01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * 1.5
 * 같은 문자가 연속으로 반복될 경우, 그 횟수를 사용해 문자열을 압축하는 메서드를 구현하라.
 * 가령 압축해야 할 문자열이 aabccccccccaaa라면 a2b1c8a3과 같이 압축되어야 한다.
 * 압축 결과로 만들어지는 문자열이 원래 문자열보다 짧아지지 않는 경우, 이 메서드는 원래 문자열을 그대로 반환해야 한다.
 */
public class Exam01_5Test {

	@Test
	public void testAnswer() {
		Exam01_5 exam = new Exam01_5();
		
		String result = exam.answer("aabccccccccaaa");
		assertEquals("a2b1c8a3", result);
		
		String result2 = exam.answer("abcdef");
		assertEquals("abcdef", result2);
		
		String result3 = exam.answer("aabb");
		assertEquals("aabb", result3);
	}
	
	@Test
	public void testAnswer2() {
		Exam01_5 exam = new Exam01_5();
		
		String result = exam.answer2("aabccccccccaaa");
		assertEquals("a2b1c8a3", result);
		
		String result2 = exam.answer2("abcdef");
		assertEquals("abcdef", result2);
		
		String result3 = exam.answer2("aabb");
		assertEquals("aabb", result3);
	}

}
