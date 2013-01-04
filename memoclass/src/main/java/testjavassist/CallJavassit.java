package testjavassist;

import javassist.ClassPool;
import javassist.Loader;
import mainjavassittest.MainTestJavassit;


public class CallJavassit {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		ClassPool p = ClassPool.getDefault();
		
		MemoClassTranslator mg = new MemoClassTranslator();
		
		Loader cl = new Loader(p);
		cl.addTranslator(p, mg);
		cl.run(MainTestJavassit.class.getName(),args);//*/
	}

}
