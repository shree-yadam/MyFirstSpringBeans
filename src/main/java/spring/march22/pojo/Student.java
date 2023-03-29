package spring.march22.pojo;

public class Student {
	
	private String name;
	
	
	private Integer rollNo;
	
	private Address address;

	public Student() {
		super();
		System.out.println("Student constructor called ...");
	}

	public Student(String name, Integer rollNo, Address address) {
		super();

		System.out.println("Student constructor with fields called ...");
		this.name = name;
		this.rollNo = rollNo;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getRollNo() {
		return rollNo;
	}


	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", address=" + address + "]";
	}
	

}
