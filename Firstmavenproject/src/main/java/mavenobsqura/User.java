package mavenobsqura;

import java.util.Scanner;

public class User extends Bank5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("enter the pin");
		int n=c.nextInt();
		c.close();
		Bank5 obj=new Bank5();
		obj.setPin(n);
		obj.validatePin();
	}

}
