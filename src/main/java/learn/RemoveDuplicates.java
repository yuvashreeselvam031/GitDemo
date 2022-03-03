package learn;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> set  = new LinkedHashSet<String>();

		for (String eachword : split ) {
			if(set.add(eachword) == true) {
				System.out.print(eachword + " ");

			}


		}

	}
}