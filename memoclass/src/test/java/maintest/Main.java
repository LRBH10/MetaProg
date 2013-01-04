package maintest;

import simplejava.MemoClass;
import simplejava.TestMemoClass;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestMemoClass();
		new MemoClass();
		new MemoClass();
		new TestMemoClass();
		

		System.out.println(MemoClass.instances.size()+" "+MemoClass.instances);
		System.out.println(TestMemoClass.instances.size()+" "+TestMemoClass.instances);
	}

}
