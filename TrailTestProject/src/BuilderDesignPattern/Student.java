package BuilderDesignPattern;

import java.util.Date;

public  class Student { //can be interface or any abstract in Builder design pattern
    int rollno;
    String name;
    String Address;
    int id;
    int Age;
    String adharno;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", id=" + id +
                ", Age=" + Age +
                ", adharno=" + adharno +
                ", dob=" + dob +
                ", percentage=" + percentage +
                ", admissiondate=" + admissiondate +
                '}';
    }

    int dob;
    float percentage;
    Date admissiondate;

    Student(StudentBuilder builder){
        this.rollno=builder.rollno;
        this.Address= builder.Address;
        this.dob=builder.dob;
        this.name=builder.name;
        this.percentage=builder.percentage;
        this.admissiondate=builder.admissiondate;
        this.id= builder.id;
        this.adharno=builder.adharno;
        //this.toString();
    }
}
