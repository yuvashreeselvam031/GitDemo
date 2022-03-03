package ExplicitlyWait;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		// 1) Arrange the array in ascending order
		Arrays.sort(data);
		//2) Pick the 2nd element from the last and print it
		int length = data.length;
		System.out.println(data[length-2]);
		//it printed the second largest
	}

}
