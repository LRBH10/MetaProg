package simplejava;

import java.util.LinkedList;
import java.util.List;

public class MemoClass {

	public static List<MemoClass> instances = new LinkedList<MemoClass>();

	public List<? extends MemoClass> getInstances() {
		return instances;
	}

	public MemoClass() {
		System.out.println("add Instance");
		this.addInstance();
	}

	@SuppressWarnings("unchecked")
	private void addInstance() {
		List<MemoClass> s= (List<MemoClass>) this.getInstances();
		s.add(this);
	}

}
