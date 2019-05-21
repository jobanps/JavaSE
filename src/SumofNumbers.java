import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive  integer number ");
		int num = input.nextInt();
		int numTotal = 0;
		
		for(int i=1 ; i <= num ; i++) {
			
			numTotal += i;
		}
		
		System.out.println("Sum of Number for Input '" + num +"' : " + numTotal);
		
		input.close();
	
	}

}
