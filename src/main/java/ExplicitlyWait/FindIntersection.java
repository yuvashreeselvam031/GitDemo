package ExplicitlyWait;

public class FindIntersection {

	public static void main(String[] args) {
		
		// it should print values which are similar in both arrays
		//o/p 2, 4 ,7
		//a) Declare An array for {3,2,11,4,6,7};
		int[] a = {3,2,11,4,6,7};
		//b) Declare another array for {1,2,8,4,9,7};
		int[] b = {1,2,8,4,9,7};
		//c) Declare for loop iterator from 0 to array length
		for (int i = 0; i < a.length; i++) {
        //d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < b.length; j++) {
				// e) Compare Both the arrays using a condition statement
				// using if condition compare both array
				if (a[i]==b[j]) {
					//if it was same print the value
					// f) Print the first array (shoud match item in both arrays)
					System.out.println(a[i]);
					
				}
				
			}
			
		}
		

	}

}
