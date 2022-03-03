package learn;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=7;
        boolean flag=false;
        
        for (int i = 2; i<a; i++) {
        	if (a%i!=0) 
            {
            	flag=true;
            	System.out.println(+a+"is a Prime number");
            	break;
            	
    		}  else 
			{
				System.out.println(+a+"is not a Prime number");
				break;
			}
        		
		}
                
	}
}