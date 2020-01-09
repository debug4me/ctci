package com.kun2c.ctci.exam01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * 1.7
 * M*N 행렬을 순회하면서 0인 원소를 발견하면, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.
 */
public class Exam01_7Test {

	@Test
	public void testAnswer() {
		Exam01_7 exam = new Exam01_7();
		
		int[][] matrix = {{1,1,1,1}, {1,1,1,1}, {1,1,1,0}, {1,1,1,1}};
		
		int[][] result = exam.answer(matrix);
		assertEquals(0, result[0][3]);
		assertEquals(0, result[2][0]);
		assertEquals(0, result[2][3]);
		assertEquals(1, result[0][0]);
	}
	
	@Test
	public void testAnswer2() {
		Exam01_7 exam = new Exam01_7();
		
		int[][] matrix = {{1,1,1,1}, {1,1,1,1}, {1,1,1,0}, {1,1,1,1}};
		
		int[][] result = exam.answer2(matrix);
		assertEquals(0, result[0][3]);
		assertEquals(0, result[2][0]);
		assertEquals(0, result[2][3]);
		assertEquals(1, result[0][0]);
	}

}
