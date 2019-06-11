package week06;


import java.util.ArrayList;


public class ArrayListExamples {
	
	public static void main(String[] args) {

		// 1. Create a new List
		ArrayList<String> names = new ArrayList<String>();
		
		// 1. Add 2 people to the list
		names.add("Joban");
		names.add("Gundeep");
				
		// 2. Output total number of people in list
		
		System.out.println("Number of Items in List : " + names.size());
		
		// 3. Delete someone from the list
		
		names.remove(1);
		
		
		// 4. Output all people in the list
		for(int i=0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
		
		}
		
		names.add("Gundeep");
		names.add("Harman");
		names.add("Manpreet");
		// 5. Get one person out of the list
		
		
		
		// 6. Change the name of the person
		names.set(0,"Jobanpreet");
		
		
for(int i=0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
		
		}
		// 7. Delete everyone from list
		
		names.clear();
		
		// 8. Loop through every item in the list and output:
		// HELLO _______ (where ___ is the name)
		
		System.out.println("size " + names.size());
		
	}
	
	

}
