package week05;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calcTax(100);
		Functions obj = new Functions();
		
		System.out.println("Grade : " + obj.testScores());
		
	}
	
	/* Function to calculate the amount of Tax you need to pay */
	
	public  void calcTax(double price) {
		
		double taxAmount = price * 0.13;
		System.out.println("Tax : " + taxAmount);
		
	}

	// 2as = v
	
	// P2:  Write a function that calculates 
		// the distance that an object falls down (under gravity)
		// d = 0.5*g*t    // g = gravity (9.8m/s^2)
		// t = time 	  - how long its falling for
		
		// Your function 2 parameters:
		// -- parameter 1  is gravity
		// -- parameter 2 is time (in seconds)
		// Your function should OUTPUT the result to console
	
	public  void calcDistance(double gravity, int time) {
		
		double distance = 0.5 * gravity * time;
		
		System.out.println("Distance : " + distance);
	}
	
	public  String testScores() {
		
		Scanner input = new Scanner(System.in);
		int marks;
		int totalMarks = 0;
		
		for(int i = 1; i <= 5 ; i++) {
			
			System.out.println("Enter Test Score of Subject " + i);
			marks = input.nextInt();
			totalMarks += marks;
		}
		
		double average = totalMarks/5.0;
		
		if(average >= 90)
			return "A";
		else if(average >= 80)
			return "B";
		else if(average >= 70)
			return "C";
		else if(average >= 60)
			return "D";
		else 
			return "F";
		
	}
}
