package mavenobsqura;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("blue");
		list.add("black");
		list.add("red");
		list.add("green");
		System.out.println(list);
		list.remove(2);
		System.out.println(list.get(0));
		for(String a:list) {
			System.out.println(a);
		}
		if(list.contains("orange"))
			System.out.println("element found");
		else
			System.out.println("not found");
		

	}

}
