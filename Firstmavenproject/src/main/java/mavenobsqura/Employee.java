package mavenobsqura;

public class Employee {
	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj=new Address("pala","kerala","India",6866);
		Employee obj2=new Employee(101,"tom",obj);
		obj2.display();
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
		System.out.println(address.zip);
	}

}
