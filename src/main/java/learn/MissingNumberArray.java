package learn;

import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,7,8};
		int sum=0;
	   	Arrays.sort(arr);
	   	
	   	// sum of avaiable numbers in array 
	   	
	   	for(int i=0;i<arr.length;i++)
	   	{
	   		sum=sum+arr[i];
	   		
	   	}
	   	System.out.println("The  Summ of Avaialable element in array:"+ sum);
		
	    int sum1=0; 
	    for(int i=0;i<=8;i++)
	    {
	    	sum1=sum1+i;
	    
	    }
		System.out.println("The  Summ of Avaialable element in array including mising number:"+ sum1);

	    int sum3= sum1-sum;
	    
	    System.out.println("The Missing number is :"+ sum3);
	
}
}