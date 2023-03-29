package spring.march22.pojo;

public class Person {
	
	private String name;
	
	private Integer age;

	public Person() {
		super();
		System.out.println("Person contructor called...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
