package week06;

public class ArraysExamples {
	
	public static void main(String[] args) {
		
		// 1. Create an empty array of String
		// By default, array stores 5 names
		String[] names = new String[5];
		
		// 2. Show the total number of items in array
		System.out.println("Total number of items in array: ");
		// @TODO: Write code to output total num items to array
		System.out.println(names.length);
		System.out.println("----------");
		
		// 3. Add something to array
		names[0] = "Jenelle";
		// @TODO: Write code to add someone to index 3
		names[3] = "Joban";
		
		// 4. Output the item in position 0
		System.out.println("Name in pos 0: ");
		// @TODO: Write the code to output the the name in pos 0
		System.out.println(names[0]);
		System.out.println("----------");
		
		
		// 5. Output everything in array
		System.out.println("Everything in array: ");
		// @TODO: Write code to output everything
		for(int i=0 ; i < names.length ; i++)
			System.out.println("Item at " + i + " : " + names[i]);
		
		try {
		// 6. Add something to the end of the array
		names[7] = "Emad"; 
		System.out.println("Emad added to position 7");
		} catch(Exception e) {
			System.out.println("Error in adding Emad at 7th Posn");
		}
		// @TODO:  Write code to output names[7] to screen
		
		
		
		// 7. Remove someone from the array
		// @TODO: Fill in code here
		System.out.println("Removing item from the array");
		names[3] = null;	// Removing item
		// 8. Loop through every item in the array and output:
		// HELLO _______ (where ___ is the name)
		names[1] = "Joban";
		names[2] = "Gundeep";
		names[3] = "Harman";
		
		for(int i=0 ; i<names.length; i++) {
			System.out.println(" HELLO " + names[i]);
		
		}
		
		for(int i=0 ; i<names.length; i++) {
			System.out.print(" " + names[i]);
		
		}
		
		// 9. Shift everyone by 1 position
		// @TODO: Fill in code here
		/*for(int i=names.length-1 ; i>=1 ; i--) {
			
				names[i] = names[i-1];
			
		}
		names[0] = null;
		*/
		
		String newElement = names[0];
		String currentElement;
		for(int i = 1; i < names.length; i++) {
			
			currentElement = names[i];
			names[i] = newElement;
			newElement = currentElement;
		}
		names[0] = null;
		
		/*String temp = names[0];
		for(int i=0; i<names.length-1 ; i++) {
			
			names[i] = names[i+1];
		}
		names[names.length-1] = temp;
		*/
		System.out.println();
		for(int i=0 ; i<names.length; i++) {
			System.out.print(" " + names[i]);
		
		}
	}

}
