package advance.dev;

public class Student implements Cloneable{
	String name;
	int age;
	String address;
	String phone;
	double �TB;
	
	public Student(String name, int age, String address, String phone, double �TB) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.�TB = �TB;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name: %s, age: %s, address: %s,phone: %s, �TB: %s ", name,age,address,phone,�TB);
	}
}
