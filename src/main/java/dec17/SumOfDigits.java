package dec17;

public class SumOfDigits {

	public static void main(String[] args) {

		int a = 121;
		int sum = 0;
		int rem, quot;
		
		while (a>0) {
			rem = a%10;
			System.out.println(rem);
	
			quot = a/10;
			System.out.println(quot);
			sum =sum+rem;
			a=quot;		
		}
		System.out.println("The sum of digits is "+sum);
	}

}
