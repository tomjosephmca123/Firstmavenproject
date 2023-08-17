package mavenobsqura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();// generic
		ll.add("lion");
		ll.add("tiger");
		ll.add("elephant");
		ll.add(0,"cat");
		ll.add("lion");
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String a:ll) {
			System.out.println(a);
		}

	}

}
