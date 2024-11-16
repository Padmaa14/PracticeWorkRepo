package RegularPractice;

public class JavaAllPrograms {
    public static void main(String[] args) {
        //Reverse a String
        System.out.println("--------- 1. Reverse a String Program ----------------------");
        String s = "simon";
        String Temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            Temp = Temp + s.charAt(i);
        }
        System.out.println("Original String :" + s + " Reversed string: " + Temp);
        System.out.println("--------- 2. Swap 2 nos without 3rd Variable ------------------");
        int no1 = 20, no2 = 30;
        System.out.println("before swapping No 1 is " + no1 + " No 2 is " + no2);
        no1 = no1 + no2 - no1;
        no2 = no1 + no2 - no2;
        System.out.println("After swapping No 1 is " + no1 + " No 2 is " + no2);
        System.out.println("--------- 3. Program to check if vowel is Present --------------");
        String a = "Padmaja", b = "aeioamba";
        boolean flag = false;
        System.out.println("original string " + a + " " + b);
        flag = a.toLowerCase().matches(".*[aeiou].*");
        System.out.println(flag);
        flag = b.toLowerCase().matches(".*[aeiou].*");
        System.out.println(flag);
        System.out.println("--------- 4. check no is prime or not");
        for (int i = 0; i <= 100; i++) {
            if (i == 0)
                System.out.println(i + " is not prime ");
            else if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("--------- 5. palindrome or not series");
        String s1 = "Padma";
        Boolean result = false;
        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) == s1.charAt(s1.length() - i - 1)) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println(s1 + " its palindrome");
        } else {
            System.out.println(s1 + " Not palindrome");
        }
        System.out.println("--------- 6. Leading and trailing whitespace from string -----------");
        String p = "< kdok RT";
        p = p.strip();
        System.out.println(p);
        System.out.println("--------- 7. Factorial of an integer in java  -----------");
        int fact=1;
        for(int i=5;i>=1;i--){
            fact=fact*i;
            System.out.print("*"+i);
        }
        System.out.println(" factorial is : "+fact);
        System.out.print("--------- 8. Print the 10 squares accenture question -------");
        for(int i=1;i<=10000;i=i*10){
            System.out.println(i);
        }

    }
}
