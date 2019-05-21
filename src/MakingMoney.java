import java.util.Scanner;

public class MakingMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter nuumber of day you work ");
		int days = input.nextInt();
		double totalAmount = 0;
		double salaryToday = 1;
		double day = 1;
		
		// Using For
		for(int i=1 ; i<=days ; i++) {
			
			totalAmount += salaryToday;
			System.out.println("You earned $" + salaryToday + " on Day " + i );
			salaryToday = salaryToday * 2;
		}
		
		System.out.printf("Total earned money: $%.2f", totalAmount);
		
		totalAmount = 0;
		salaryToday = 1;
		
		// Using While
		while(day <= days){
		
			salaryToday = Math.pow(2.0, (day-1));
			totalAmount += salaryToday;
			System.out.println("You earned $" + salaryToday + " on Day " + day);
			day++;
		}
	
		System.out.printf("Total earned money: $%.2f", totalAmount);
		
		input.close();

	}

}
