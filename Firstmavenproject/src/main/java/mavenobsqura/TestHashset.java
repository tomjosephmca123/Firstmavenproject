package mavenobsqura;

import java.util.HashSet;

public class TestHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();// generic
		hs.add("lion");
		hs.add("tiger");
		hs.add("elephant");
		hs.add("lion");
		hs.remove(1);
		System.out.println(hs);

	}

}
