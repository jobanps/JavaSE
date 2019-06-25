package week06;

import java.util.ArrayList;

public class ArrayListExamples {
	
	public static void main(String[] args) {

		// 1. Create a new List
		ArrayList<String> harry=new ArrayList<String>();
		// 1. Add 2 people to the list
		harry.add("hut");
			harry.add("jut")	;
		// 2. Output total number of people in list
		System.out.println(harry.size());
		
		// 3. Delete someone from the list
		harry.remove(0);
		
		
		
		// 4. Output all people in the list
		System.out.println(harry.toString());
		// 5. Get one person out of the list
		harry.add("hut");
		harry.add("mut")	;
		harry.add("tut");
		harry.add("put")	;
		
		
		// 6. Change the name of the person
		harry.set(0, "lut");
		// 7. Delete everyone from list
		
		
		// 8. Loop through every item in the list and output:
		// HELLO _______ (where ___ is the name)
		
		for(int i=0;i<harry.size();i++) {
			System.out.println("hello  "+harry.get(i));
		}
	}
	
	

}
