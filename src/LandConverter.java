import java.util.Scanner;

public class LandConverter {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World !!");
		
		final double ARCE_TO_FEET = 43560; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of lan in Square feets");
		int landSize = input.nextInt();
		
		double landSizeAcre = landSize / ARCE_TO_FEET;
		
		System.out.println("Size of land in Acres : " + landSizeAcre);
		
		input.close();

	}

}
