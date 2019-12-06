package com.kun2c.ctci.exam01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * 1.4
 * 주어진 문자열 내의 모든 공백을 '%20'으로 바꾸는 메서드를 작성하라.
 * 문자열 끝에 추가로 필요한 문자열을 더할 수 있는 충분한 공간이 있다고 가정하라.
 * 그리고 공백을 포함하는 문자열의 길이도 함께 주어진다고 가정하라.
 * (주의: Java로 구현한다면, 문자 배열을 사용하여 필요한 연산을 각 문자에 바로 적용할 수 있도록 하라.)
 * - 예
 * 입력: "Mr John Smith    ", 13
 * 출력: "Mr%20John%20Smith"
 */
public class Exam01_4Test {

	@Test
	public void testAnswer() {
		Exam01_4 exam = new Exam01_4();
		
		String result = exam.answer("Mr John Smith    ");
		assertEquals("Mr%20John%20Smith", result);
		
		String result2 = exam.answer("Mr John Smith");
		assertEquals("Mr%20John%20Smith", result2);
	}
	
	@Test
	public void testAnswer2() {
		Exam01_4 exam = new Exam01_4();
		
		String result = exam.answer2("Mr John Smith    ", 13);
		assertEquals("Mr%20John%20Smith", result);
		
		String result2 = exam.answer2("Mr John Smith", 13);
		assertEquals("Mr%20John%20Smith", result2);
	}
	
	@Test
	public void testAnswer3() {
		Exam01_4 exam = new Exam01_4();
		
		String result = exam.answer3("Mr John Smith    ", 13);
		assertEquals("Mr%20John%20Smith", result);
		
		String result2 = exam.answer3("Mr John Smith", 13);
		assertEquals("Mr%20John%20Smith", result2);
	}

}
