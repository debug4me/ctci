package com.kun2c.ctci.exam01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * 1.8
 * 한 단어가 다른 단어에 포함된 문자열인지 판별하는 isSubstring이라는 메서드가 있다고 하자.
 * s1과 s2의 두 문자열이 주어졌을 때, s2가 s1을 회전시킨 결과인지 판별하는 코드를 isSubstring을 한 번만 호출하도록 하여 작성하라.
 * (가령 'waterbottle'은 'erbottlewat'을 회전시켜 얻을 수 있는 문자열이다)
 */
public class Exam01_8Test {

	@Test
	public void testAnswer() {
		Exam01_8 exam = new Exam01_8();
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		assertTrue(exam.answer(s1, s2));
		
		String s3 = "waterbottlf";
		String s4 = "erbottlewat";
		
		assertFalse(exam.answer(s3, s4));
	}

}
