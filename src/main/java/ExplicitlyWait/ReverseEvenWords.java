package ExplicitlyWait;

public class ReverseEvenWords {

	public static void main(String[] args) {

		// Declare the input as Follow
		String test = "I am a software tester"; 
		//should reverse the even position o/p should be like: I ma a erawtfos tester
		//a) split the words and have it in an array
		String[] split = test.split(" ");
		//declare two empty string
		
		String temp="";
		//b) Traverse through each word (using loop)
		for (int i = 0; i < split.length; i++) {
			String revstr="";
			//i = 0 because array index start from 0 
			//so for even position will be 1 3 5 ...
			//c) find the odd index within the loop (use mod operator)
			if (i%2==1) {
				//in this position split that to character array inorder to reverse it
				char[] charArray = split[i].toCharArray();
				//use for loop to reverse it
				for (int j = charArray.length-1; j >=0; j--) {
					//now add each char in revstr string
					revstr = revstr + charArray[j];					
				}
				//after this iteration add that string to temp string
				temp = temp + revstr+ " ";
						
			} else {
				//here add the string as it is in temp
				temp = temp + split[i] +" ";
			}			
		}
		//after changed print that coverted temp string
		System.out.println(temp);
	}

}
