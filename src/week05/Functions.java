package week05;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcTax(100);
	}
	
	/* Function to calculate the amount of Tax you need to pay */
	
	public static void calcTax(double price) {
		
		double taxAmount = price * 0.13;
		System.out.println("Tax : " + taxAmount);
		
	}

}
