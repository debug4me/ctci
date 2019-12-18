package com.kun2c.ctci.exam01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * 1.6
 * 이미지를 표현하는 N*N 행렬이 있다.
 * 이미지의 각 픽셀은 4바이트로 표현된다.
 * 이때, 이미지를 90도 회전시키는 메서드를 작성하라.
 * 부가적인 행렬을 사용하지 않고서도 할 수 있겠는가?
 */
public class Exam01_6Test {
	
	@Test
	public void testAnswer() {
		Exam01_6 exam = new Exam01_6();
		
		int[][] image = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		
		int[][] result = exam.answer(image);
		assertEquals(13, result[0][0]);
		assertEquals(9, result[0][1]);
		assertEquals(5, result[0][2]);
		assertEquals(1, result[0][3]);
	}
	
	@Test
	public void testAnswer2() {
		Exam01_6 exam = new Exam01_6();
		
		int[][] image = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		
		int[][] result = exam.answer2(image);
		assertEquals(13, result[0][0]);
		assertEquals(9, result[0][1]);
		assertEquals(5, result[0][2]);
		assertEquals(1, result[0][3]);
	}

}
