package mainjavassittest;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

import testjavassist.Testfuck;

public class MainTestJavassit {

	/**
	 * @param args
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

		new Testfuck();
		new Testfuck();
		new Testfuck();
		System.out.println("##### EXcution #####\n"+Testfuck.class.getSuperclass().getName());

		Field ff = Testfuck.class.getField("instances");

		List objectInstance = new LinkedList();

		List value = (List) ff.get(objectInstance);

		System.out.println(value.size());
		//System.out.prinln(Testfuck.instances.size());
	}

}
