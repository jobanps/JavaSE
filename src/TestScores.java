import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a Java program that:
		 * Asks the user to enter 3 test scores
		 * Calculates the average score
		 * Output the average to the screen
		 */
		
		System.out.println("TestScore Class");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Score for Test 1");
		double testScore1 = input.nextDouble();
		
		System.out.println("Enter Score for Test 2");
		double testScore2 = input.nextDouble();
		
		System.out.println("Enter Score for Test 3");
		double testScore3 = input.nextDouble();
		
		double averageScore = (testScore1 + testScore2 + testScore3) / 3;
		
		System.out.println("Average Test Score : " + averageScore);
		
		input.close();

	}

}
