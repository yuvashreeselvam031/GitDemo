package ExplicitlyWait;

public class FindTypes {

	public static void main(String[] args) {

		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		//in this string need to count the types seperately
		// Here is what the count you need to find
		int letter = 0, space = 0, num = 0, specialChar = 0;
		// Build the logic to find the count of each
		//a) Convert the String to character array
		char[] charArray = test.toCharArray();
		//b) Traverse through each character (using loop)
		for (int i = 0; i < charArray.length; i++) {
			//c) Find if the given character is what type using (if)
			if (Character.isLetter(charArray[i])) {
				letter++;
			}else if (Character.isDigit(charArray[i])) {
				num++;
			}else if (Character.isSpaceChar(charArray[i])) {
				space++;
			}
			else {
				specialChar++;
			}
		}
		// Print the count here
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

	}

}
