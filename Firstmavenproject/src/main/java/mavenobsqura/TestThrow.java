package mavenobsqura;

public class TestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=13;
		if(age<18) {
			throw new ArithmeticException("person not eligible to vote");
		}
		else {
			System.out.println("eligible to vote");
		}
			

	}

}
