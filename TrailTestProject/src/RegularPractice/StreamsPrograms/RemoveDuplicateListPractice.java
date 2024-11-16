package RegularPractice.StreamsPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateListPractice {
    public static void main(String arg[]) {
        List<Student> stobj = new ArrayList<>();
        stobj.add(new Student(1, 5, "Ria"));
        stobj.add(new Student(1, 5, "Ria"));
        stobj.add(new Student(9, 9, "Dua"));
        stobj.add(new Student(9, 9, "Dua"));
        stobj.add(new Student(3, 6, "tuna"));
        stobj.add(new Student(6, 5, "pria"));
        stobj.stream().filter(obj->Collections.frequency(stobj,obj)>1).forEach(System.out::println);// to get duplicates

        Student s1 = new Student(6, 5, "AMP");
        Student s2 = new Student(6, 5, "AMP");
        System.out.println(s1 == s2); //false always
        System.out.println(s1.equals(s2)); //true in case of equals and hashcode

        //remove duplicate entry
       // stobj.stream().filter((a)->a.getName().equals("tuna")).forEach(System.out::println);
       // stobj.stream().distinct().forEach(System.out::println); //distinct only in case if not object

        stobj.stream().filter(std->Collections.frequency(stobj,std)==1).forEach(System.out::println); //works Removes duplicates
        
       
        

    }
}

/*
 * class Student1 { int sr_no; int age; String name;
 * 
 * Student1(int sr_no, int age, String name) { this.sr_no = sr_no; this.name =
 * name; this.age = age; }
 * 
 * public int getSr_no() { return sr_no; }
 * 
 * public void setSr_no(int sr_no) { this.sr_no = sr_no; }
 * 
 * 
 * 
 * 
 * @Override public String toString() { return "Student{" + "Serial no=" + sr_no
 * + ", age=" + age + ", name='" + name + '\'' +
 * 
 * '}'; }
 * 
 * @Override public boolean equals(Object o) { if (this == o) return true; if (o
 * == null || getClass() != o.getClass()) return false; Student1 student =
 * (Student1) o; return sr_no == student.sr_no && Objects.equals(name,
 * student.name); }
 * 
 * @Override public int hashCode() { return Objects.hash(sr_no, name); }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * 
 * public int getAge() { return age; }
 * 
 * public void setAge(int age) { this.age = age; }
 * 
 * 
 * }
 * 
 */