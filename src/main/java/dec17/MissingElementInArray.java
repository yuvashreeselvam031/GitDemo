package dec17;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8,11};
		
		Arrays.sort(arr);
		
		Arrays.sort(arr);
		//{1234678}
		//{0123456}
		for (int i = 1; i<=arr.length-1; i++) {
				if(((arr[i]-arr[i-1])!=1)){
					int Missing = arr[i-1]+1;
					System.out.println("missing number "+Missing);

	}

		}
	}
	
}