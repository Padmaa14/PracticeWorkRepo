package BuilderDesignPattern;

import java.util.Date;
import java.util.List;

public abstract class StudentBuilder {
    int rollno;
    String name;
    String Address;
    int id;
    int Age;

    String adharno;
    int dob;
    float percentage;
    Date admissiondate;
    List<String> Subjects;

    public Student build(){
        return new Student(this); // we are passing this so the student constructor recieved the Stringbuilder object
    }

    public StudentBuilder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        Address = address;
        return this;
    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setAge(int age) {
        Age = age;
        return this;
    }

    public StudentBuilder setAdharno(String adharno) {
        this.adharno = adharno;
        return this;
    }

    public StudentBuilder setDob(int dob) {
        this.dob = dob;
        return this;
    }

    public StudentBuilder setPercentage(float percentage) {
        this.percentage = percentage;
        return this;
    }

    public StudentBuilder setAdmissiondate(Date admissiondate) {
        this.admissiondate = admissiondate;
        return this;
    }

    abstract public StudentBuilder setSubjects();

}
