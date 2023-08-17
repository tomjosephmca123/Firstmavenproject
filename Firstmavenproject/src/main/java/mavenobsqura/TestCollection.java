package mavenobsqura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ArrayList<String> list = new ArrayList<String>();// generic
		list.add("lion");
		list.add("tiger");
		list.add("elephant");
		//list.remove(0);
		list.add(0,"cat");
		list.add("lion");//duplicate element possible
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
//		ArrayList<String> list2 = new ArrayList<String>();
//		list2.add("car");
//		list2.add("bike");
//		list2.add("cycle");
//		System.out.println(list2);
//		list.addAll(list2);
//		//System.out.println(list);
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		

	}

}
