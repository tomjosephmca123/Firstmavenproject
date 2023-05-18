package mavenobsqura;

public class Employee2 {
	private int id;
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1=new Employee2();
		e1.setId(101);
		e1.setName("tom");
		System.out.println(e1.getId());
		System.out.println(e1.getName());

	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	

}
