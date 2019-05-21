import java.util.Scanner;

public class SoftwareSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of software packages required");
		int softwareCount = input.nextInt();
		
		double discount, subTotal, discountAmount, finalAmount;
		
		subTotal = 99 * softwareCount;
		
		if(softwareCount >= 100 )
			discount = 0.50;
		else if(softwareCount >=50)
			discount = 0.40;
		else if(softwareCount >=20) 
			discount = 0.30;
		else if(softwareCount >=10)
			discount = 0.10;
		else 
			discount = 0;
	
		discountAmount = subTotal * discount;
		finalAmount = subTotal - discountAmount;
		
		System.out.println("Sub Total : $" + subTotal);
		System.out.printf("Final Total : $%.2f \n", finalAmount);
		System.out.println("Discount : " + (discount * 100) + "%");
		System.out.println("Discount Amount : $" + discountAmount);
		
		input.close();
		
	}

}
