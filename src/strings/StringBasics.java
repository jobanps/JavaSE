package strings;

public class StringBasics {

	public static void main(String[] args) {
		
		String name = "Jobanpreet Singh";
		System.out.println("String Content : " + name);
		
		int numberOfChar = name.length();
		System.out.println("Number of Char in string : " + numberOfChar);
		
		char charvalue = name.charAt(9);
		System.out.println("Char in string at 10th posn : " + charvalue);
		
		String subStr = name.substring(5,10);
		System.out.println("SubString 5,10 : " + subStr);
		
		String name2 = "JObanrpeet SIngh";
		
		if(name.equals(name2)) {
			System.out.println("String are Equal");
		} else {
			System.out.println("String are not Equal");
		}
		
		String lowerStr = name.toLowerCase();
		System.out.println("String in lowercase : " + lowerStr);
	
		String upperStr = name.toUpperCase();
		System.out.println("String in uppercase : " + upperStr);
	}

}
