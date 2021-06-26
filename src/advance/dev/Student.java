package advance.dev;

public class Student implements Cloneable{
	String name;
	int age;
	String address;
	String phone;
	double ÐTB;
	
	public Student(String name, int age, String address, String phone, double ÐTB) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.ÐTB = ÐTB;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name: %s, age: %s, address: %s,phone: %s, ÐTB: %s ", name,age,address,phone,ÐTB);
	}
}
