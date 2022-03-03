package ExplicitlyWait;

public class SumOfDigits {

	public static void main(String[] args) {

		int a = 123;
		// Initialize an integer variable by name: sum
		int sum =0;
		//also initialize remainder and quotient;
		int remainder, quotient;
		// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0
		// again a=0 which is not greater that 0
		// so loop stops here
		while (a>0) {
			// Within loop: get the remainder when done by 10 -> Tip: use mod %
			remainder = a % 10;
			//1%10 = 1
			// here we will be having only 1 as remainder
			// Print the remainder to confirm
			//first divising the num with mod operater we are getting 2 now
			
			System.out.println(remainder);// 1
			// Within loop: add that remainder to the sum
			sum = sum + remainder;
			//we have sum = 5
			//5+1=6
			//and here sum value will be 5
			//so now sum = 6
			// Print the sum to confirm
			System.out.println(sum);
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			//1/10 =0
			quotient = a/10;
			a=quotient;
			//assign that 1 to a so now the num a become 0
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			//here we are getting quotient value 0
			// now a become 0
			System.out.println(quotient);
			//third iteration over
			
		}
		// Outside the loop: print the final sum
		// now printing the sum value we have 6
		System.out.println("sum of digits: "+sum);
		
	}

}
