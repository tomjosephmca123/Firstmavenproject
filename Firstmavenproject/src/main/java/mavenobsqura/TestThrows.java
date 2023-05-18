package mavenobsqura;

public class TestThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrows obj=new TestThrows();
		try {
		System.out.println(obj.divNum(10, 0));
		}
		catch(Exception e) {
			System.out.println("division by zero not possible");
		}

	}
	public int divNum(int a,int b) throws ArithmeticException{
		return a/b;
	}

}
