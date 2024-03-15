package Internship;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        int numSubjects = 5;
	        int totalMarks = 0;
	        int[] marks = new int[numSubjects];
	        String[] subjects = {"Maths", "Science", "English", "History", "Geography"};
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks obtained in " + subjects[i] + ": ");
	            marks[i] = input.nextInt();
	            totalMarks += marks[i];
	        }
	        double averagePercentage = (double) totalMarks / numSubjects;
	        String grade;
	        if (averagePercentage >= 90) {
	            grade = "A+";
	        } else if (averagePercentage >= 80) {
	            grade = "A";
	        } else if (averagePercentage >= 70) {
	            grade = "B";
	        } else if (averagePercentage >= 60) {
	            grade = "C";
	        } else if (averagePercentage >= 50) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage);
	        System.out.println("Grade: " + grade);
	}

}
