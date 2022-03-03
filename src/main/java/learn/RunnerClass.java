package learn;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunnerClass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Check c = new Check();
		
		Method m = Check.class.getDeclaredMethod("sample");
		
		m.setAccessible(true);
		
		m.invoke(c);
		
		String str = "WelcomeWel";
		
		String replace = str.replace("Wel", "be");
		System.out.println(replace);
		
		String replaceAll = str.replaceAll("Wel", "test");
		System.out.println(replaceAll);
	}

}
