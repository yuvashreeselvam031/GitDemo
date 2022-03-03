package ExplicitlyWait;

public class RemoveDuplicates {

	public static void main(String[] args) {

		//a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		//b) Initialize an integer variable as count	 
	    int count = 0;
	    //c) Split the String into array and iterate over it 
	    String[] split = text.split(" ");
	    for (int i = 0; i < split.length; i++) {
	    	//d) Initialize another loop to check whether the word is there in the array
	    	//inorder to check the word without the place of i
	    	for (int j = i+1; j < split.length; j++) {
	    		// e) if it is available then increase and count by 1. 
	    		if (split[i].equals(split[j])) {
	    			// if the count > 1 then replace the word as "" 
	    			split[j]="";				
				}
				
			}
	    	    	
			
		}
	    //use another for loop to print the split
	    for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]+" ");
		}
	    
	}

}
