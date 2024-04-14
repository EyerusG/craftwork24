package com.assignment1;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] A= {{1,2,3}, {4,5,6}};
		int[][] B= {{7,8,9}, {10,11,12}};
	
		
		for(int i=0; i < A.length; i++) {
			for(int j =0; j <A[0].length; j++) {
				System.out.print(A[i][j] + B[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	}


