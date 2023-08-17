package mavenobsqura;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj=new ChildClass();
		obj.print();
		

	}
	public void print() {
		super.print();
		System.out.println("this is child");
	}

}
