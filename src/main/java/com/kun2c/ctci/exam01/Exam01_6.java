package com.kun2c.ctci.exam01;

public class Exam01_6 {

	public int[][] answer(int[][] image) {
		
		int[][] result = new int[image.length][image[0].length];
		
		for (int i=0; i<image.length; i++) {
			int move = image.length - 1 - i;
			for (int j=0; j<image[0].length; j++) {
				result[j][move] = image[i][j];
			}
		}
		
		return result;
	}
	
	public int[][] answer2(int[][] image) {
		
		for (int layer=0; layer<image.length/2; layer++) {
			int first = layer;
			int last = image.length - 1 - layer;
			
			for (int i=first; i<last; i++) {
				int offset = i - first;
				
				int top = image[first][i];
				image[first][i] = image[last-offset][first];
				image[last-offset][first] = image[last][last-offset];
				image[last][last-offset] = image[i][last];
				image[i][last] = top;
			}
		}
		
		return image;
	}

}
