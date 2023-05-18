package mavenobsqura;

public class Division {
	 static int a=10;
	 static int b=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
		
		try {
			System.out.println(arr[3]);
		float c=a/b;
		System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("arrayerror");
		}
		catch(Exception e){
			System.out.println("division by zero not possible");
		}
		
		finally{
			System.out.println("hello");
		}

	}

}
