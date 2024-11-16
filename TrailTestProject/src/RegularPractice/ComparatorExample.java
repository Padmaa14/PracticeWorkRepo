package RegularPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String arg[]) {
        List<Employee> traineesList = new ArrayList<>();
        traineesList.add(new Employee(1, 30, 50500, "F", "rathi jain", "VC"));
        traineesList.add(new Employee(2, 22, 22500, "M", "Pritesh", "Trainer"));
        traineesList.add(new Employee(3, 26, 35500, "M", "kunal", "Manager"));
        traineesList.add(new Employee(4, 22, 33500, "F", "Swathi", "Manager"));
        traineesList.add(new Employee(5, 26, 28500, "F", "Aditi M", "Trainer"));
        traineesList.add(new Employee(6, 23, 28500, "M", "junha jain", "Trainer"));
        for (int i = 0; i < traineesList.size(); i++)
            System.out.println(traineesList.get(i));
        Collections.sort(traineesList, new EmployeeComparator());

        System.out.println("------------------------");
        for (int i = 0; i < traineesList.size(); i++)
            System.out.println(traineesList.get(i));


    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getAge() == o2.getAge())
            return o1.salary - o2.getSalary();
        else
            return o1.age - o2.age;
    }
}

class Employee {
    int id;
    String name;
    int age;
    String gender;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
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
