package com.assignment1;

import java.util.Scanner;

public class AverageGradeCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many subjects do you have? ");
		
		int numSubjects = scan.nextInt(); 
		
		double[] scores = new double[numSubjects]; // declaring array variable 
		double sum =0; 
		
		for(int i=0; i < scores.length; i++) {
			
		System.out.print("Enter the score for subject" + (i + 1) + " : ");
		
		double grades = scan.nextInt(); //scanner syntax 
		
		// adding the value of each grades
		sum = sum + grades;
		}
		double averageGrade = sum/numSubjects;
		System.out.print("Average grade: " + averageGrade);
		
		scan.close();
		

	}

}
