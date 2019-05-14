import java.util.Scanner;

public class RecipeCalc {

	public static void main(String[] args) {
		
		/*
		 * 
		 * To make 48 Timbits, you need
		 * 1.5 cups of sugar
		 * 1 cup of butter
		 * 2.75 cups of flour
		 * Write a Java program to calculate how much sugar, butter, and flour you need to create a batch of Timbits.
		 * Your program should:
		 * Ask the user to enter how many Timbits she wants to make
		 * Output the amount of sugar, butter, and flour that is needed 
		 */
		
		System.out.println("Recipe Class");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many Timbits you want !");
		double timbitsCount = input.nextDouble();
				
		double numberOfBatches = timbitsCount / 48;
		
		System.out.println("Cups of Sugar : " + (numberOfBatches * 1.5));
		System.out.println("Cups of Butter : " + (numberOfBatches * 1));
		System.out.println("Cups of Flour : " + (numberOfBatches * 2.75));
		
		
		
		input.close();
		
	}
}
