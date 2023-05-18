package mavenobsqura;

public class Bank5 {
	static private int pin;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void validatePin() {
		Bank5 ob=new Bank5();
		if(ob.getPin()==1001)
			System.out.println("valid pin");
		else if(ob.getPin()==1234)
			System.out.println("valid pin");
		else if(ob.getPin()==1212)
			System.out.println("valid pin");
		else
			System.out.println("not valid pin");
		
	}

}
