import java.util.Scanner;

public class FatCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total amount of calories in the food ");
		double calories = input.nextDouble();
		System.out.println("Enter number of grams of fat in the food ");
		double fat = input.nextDouble();
		
		if(fat*9 < (calories*.30))
			System.out.println("Food is Healthy");
		else 
			System.out.println("Food is Unhealthy");
	
		input.close();
	}

}
