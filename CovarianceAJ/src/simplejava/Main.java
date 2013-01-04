package simplejava;

import base.Atom;
import base.Graph;
import base.Molecule;
import base.NoNCompatibleType;
import base.Node;


public class Main {

	/**
	 * @param args
	 * @throws NoNCompatibleType 
	 */
	public static void main(String[] args) throws NoNCompatibleType {
		Graph f = new Graph();
		
		Node n = new Node();
		
		f.addNode(n);
		
		Molecule m = new Molecule();
		Node a = new Atom();
		f.addNode(a);
	
	}

}
