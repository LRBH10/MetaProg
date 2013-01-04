package simplejava;

import java.util.LinkedList;
import java.util.List;

public class TestMemoClass extends MemoClass {

	public static List<TestMemoClass> instances = new LinkedList<TestMemoClass>();

	public List<? extends TestMemoClass> getInstances() {
		return instances;
	}

	public TestMemoClass() {
	}

	

}
