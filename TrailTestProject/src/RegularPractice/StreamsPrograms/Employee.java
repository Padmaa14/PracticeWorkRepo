package RegularPractice.StreamsPrograms;

public class Employee {
	int id;
	String name;
	int age;
	String gender;

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\''
				+ ", salary=" + salary + ", designation='" + designation + '\'' + '}';
	}

	Employee(int id, int age, int salary, String gender, String name, String designation) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	int salary;
	String designation;

}
