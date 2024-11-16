package RegularPractice;

import java.util.*;

public class ComparableExample {
    public static void main(String arg[]){
        List<Trainee> traineesList=new ArrayList<>();
        traineesList.add(new Trainee(1,30,50500,"F","rathi jain","VC"));
        traineesList.add(new Trainee(2,22,22500,"M","Pritesh","Trainer"));
        traineesList.add(new Trainee(3,25,35500,"M","kunal","Manager"));
        traineesList.add(new Trainee(4,22,33500,"F","Swathi","Manager"));
        traineesList.add(new Trainee(5,26,28500,"F","Aditi M","Trainer"));
        traineesList.add(new Trainee(6,23,28500,"M","junha jain","Trainer"));
        Collections.sort(traineesList);


    }
}

class Trainee implements Comparable<Trainee>{
    int id;
    String name;
    int age;
    String gender;

    Trainee(int id,int age,int salary,String gender,String name,String designation){
        this.id=id;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
        this.name=name;
        this.designation=designation;
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

    @Override
    public int compareTo(Trainee o) {
        return 0;
    }
}

