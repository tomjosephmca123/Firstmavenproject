package mavenobsqura;

public class Address2 {
	static String city="pala";
	static String state="kerala";
	static String country="India";
	static int zip=686652;
	Student student;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address2 obj=new Address2();
		obj.display();

	}
	public void display() {
		System.out.println(student.name);
		System.out.println(student.rollno);
	}

}
