package ExplicitlyWait;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {

		//Build a logic to find the given string is palindrome or not
		//a) Declare A String value as"madam"
		 String str = "madam";
		 //convert the string to array
		 char[] charArray = str.toCharArray();
		 //initialize count = 0;
		 int count =0;
		 //create another empty array to the size of charArray to store reversed characters
		char a[] = new char[charArray.length];
		//iterate a for loop to store in reverse order
		//i should iterate from last so using length-1
		for (int i = charArray.length-1; i >=0; i--) {
			//now store each char in a array to the index of count
			a[count]= charArray[i];
			count++;					
		}
		//now check if both arrays are same
		if (Arrays.equals(charArray, a)) {
			System.out.println("it is a palindrom");
		} else {
			System.out.println("it is not a palindrom");

		}
	}

}
