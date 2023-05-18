package mavenobsqura;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String d=ExcelCode.getStringData(2, 0);
		System.out.println(d);
		String e=ExcelCode.getIntgerData(3, 1);
		System.out.println(e);

	}

}
