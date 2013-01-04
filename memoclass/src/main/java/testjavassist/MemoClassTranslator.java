package testjavassist;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.Translator;
import annot.MemoClassAnnotation;

public class MemoClassTranslator implements Translator {

	public void onLoad(ClassPool p, String clazz) throws NotFoundException,
			CannotCompileException {

		Class<?> c = null;
		try {
			c = Class.forName(clazz);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MemoClassAnnotation as = c.getAnnotation(MemoClassAnnotation.class);
		if (as == null) {
			System.out.println("Annotation does not exist for "+ clazz);
		} else {
			System.out.println("Make  '" + clazz + "' a MemoClass");

			CtClass t = p.getCtClass(clazz);

			System.out
					.println("Add Static Field instances to  '" + clazz + "'");
			CtField s = CtField
					.make("public static java.util.List instances = new java.util.LinkedList();",
							t);
			t.addField(s);

			System.out.println("Add get getInstances() to  '" + clazz + "'");
			CtMethod l = CtMethod.make(
					"public java.util.List getInstances() {return instances;}",
					t);

			t.addMethod(l);

			System.out.println("Set Super Class Of '" + clazz
					+ "' to MemoClass");
			CtClass mc = p.getCtClass("simplejava.MemoClass");
			t.setSuperclass(mc);
		}

	}

	public void start(ClassPool p) throws NotFoundException,
			CannotCompileException {
		CtClass f = p.makeClass("rabah");
		
	}
}
