package aspects;

import base.NoNCompatibleType;

public aspect Covariance {
	pointcut addNodeCheck(base.Node node) : 
		(execution(* base.Graph.addNode(base.Node)) && args(node));
	
	
	pointcut addAtomCheck(base.Atom node) : 
		(execution(* base.Graph.addNode(base.Node)) && args(node));
	
	
	before(base.Atom node) throws NoNCompatibleType : addAtomCheck(node) {
		System.out.println("Add atome");
		if(!(thisJoinPoint.getThis() instanceof base.Molecule)) throw new base.NoNCompatibleType();

	}
	
	before(base.Node node) throws base.NoNCompatibleType : addNodeCheck(node) {
		System.out.println("Add Node");
		if(!(thisJoinPoint.getThis() instanceof base.Graph)) throw new base.NoNCompatibleType();
		
	}
	
	
	
}
