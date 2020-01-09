package com.kun2c.ctci.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam01_7 {

	public int[][] answer(int[][] matrix) {
		
		Set<Integer> rowSet = new HashSet<Integer>();
		Set<Integer> columnSet = new HashSet<Integer>();
		// boolean[] row = new boolean[matrix.length];
		// boolean[] column = new boolean[matrix[0].length];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rowSet.add(i);
					columnSet.add(j);
				}
			}
		}
		
		Iterator<Integer> rowIter = rowSet.iterator();
		while(rowIter.hasNext()) {
			int i = rowIter.next();
			for (int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = 0;
			}
		}
		
		Iterator<Integer> columnIter = columnSet.iterator();
		while(columnIter.hasNext()) {
			int j = columnIter.next();
			for (int i=0; i<matrix[0].length; i++) {
				matrix[i][j] = 0;
			}
		}
		
		return matrix;
	}
	
	public int[][] answer2(int[][] matrix) {
		
		boolean firstRow = false;
		boolean firstColumn = false;
		for (int j=0; j<matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				firstRow = true;
				break;
			}
		}
		for (int i=0; i<matrix.length; i++) {
			if (matrix[i][0] == 0) {
				firstColumn = true;
				break;
			}
		}
		
		for (int i=1; i<matrix.length; i++) {
			for (int j=1; j<matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for (int i=1; i<matrix.length; i++) {
			if (matrix[i][0] == 0) {
				for (int j=1; j<matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		for (int j=1; j<matrix[0].length; j++) {
			if (matrix[0][j] == 0) {
				for (int i=1; i<matrix.length; i++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		if (firstRow) {
			for (int j=0; j<matrix[0].length; j++) {
				matrix[0][j] = 0;
			}
		}
		if (firstColumn) {
			for (int i=0; i<matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}
		
		return matrix;
	}

}
