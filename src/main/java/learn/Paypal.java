package learn;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.collections4.functors.IfTransformer;

public class Paypal {

	public static void main(String[] args) {

		String str = "PayPal India";
		char[] charArray = str.toCharArray();
		
		Set<Character> charSet  =new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]!=' ') {
				charSet.add(charArray[i]);		
			} 
		}
		for (Character character : charSet) {
			System.out.println(character);
		}
	
		
	}

}
