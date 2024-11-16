package RegularPractice;

import java.util.Arrays;
import java.util.List;

public class StringTests {
    public static void main(String[] args) {
        String s1 = new String("oop");
        String s2 = "oop";
      //  String s3 = s1.intern(); //creates the new string in sop if its not present
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
      //
        //  System.out.println(s3.hashCode());
        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        System.out.println("s1==s2 : "+(s1==s2));
        System.out.println(" s1.intern()==s2.intern() : "+(s1.intern()==s2.intern()));
        String s="loop";
        System.out.println(s=="loop");

        String str = "how-to-do.in.java&o*p";
        String[] m=str.split("-|\\.|\\&|\\*");
        Arrays.stream(m).forEach(System.out::println);
        // System.out.println(m);
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // numbers.add(6); unmodifiable because list.of is immutable factory method
         numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

         String a = "Padma";
         String b = "Padma";
         System.out.println(a == b);
         System.out.println(a.equals(b));
         System.out.println(a.hashCode() + " " + b.hashCode());
         String ss = new String("Padma");
         System.out.println(a.equals(ss));
         System.out.println(a == ss);
         
      // String methods
 		String ss1 = "Padma";
 		String ss2 = "padma";
 		System.out.println("----Strings------");
 		System.out.println(ss1.equals(ss2));
 		String ss3 = new String("Padma");




    }
}
