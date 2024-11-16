package RegularPractice.StreamsPrograms;

import java.util.Objects;

public class Student {

	int sr_no;
	int age;
	String name;

	Student(int sr_no, int age, String name) {
		this.sr_no = sr_no;
		this.name = name;
		this.age = age;
	}

	public int getSr_no() {
		return sr_no;
	}

	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}

	@Override
	public String toString() {
		return "Student{" + "Serial no=" + sr_no + ", age=" + age + ", name='" + name + '\'' +

				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student) o;
		return name == student.name;
		// return sr_no == student.sr_no && Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sr_no, name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
