package LeetCodeInterviewbit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestSubstringWithotRepeatCharacter {
    public static void main(String arg[]) {
        //Reverse the string without using string function
        String name = "Padma karande";
        char[] arr = name.toCharArray();
        System.out.println(name.length());
        System.out.println(arr.length);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        // swap using two numbers
        //  0  b = b + a; // now b is sum of both the numbers
        //   a = b - a; // b - a = (b + a) - a = b (a is swapped)
        //  b = b - a; // (b + a) - b = a (b is swapped)
        System.out.println(" LEET CODE 3. Longest Substring Without Repeating Characters------------");
        String a = "abcabcbb", temp1 = "";
        List<String> substrings = new ArrayList<>();
        if (a==null || a.length()==0) {
            System.out.println("a is blank");
        } else {
            for (int i = 0; i < a.length(); i++) {
                int j = i + 1;
                boolean s = j <= a.length() - 1;
                if (s) {
                    if (String.valueOf(a.charAt(i)).equals(String.valueOf(a.charAt(j)))) {
                        temp1 = temp1 + a.charAt(i);
                        substrings.add(temp1);
                        temp1 = "";
                    } else {
                        temp1 = temp1 + a.charAt(i);
                    }
                } else {
                    temp1 = temp1 + a.charAt(i);
                    substrings.add(temp1);
                }
            }
            Optional length = substrings.stream().max(Comparator.comparingInt(i -> i.toString().length()));
            System.out.println("The answer is  :" + length.get().toString() + " length is :" + length.get().toString().length());



            /* if (temp1.isEmpty()) {
                temp1 = temp1 + a.charAt(i);
            } else {
                //check if it contains the i char
                boolean value = temp1.contains(String.valueOf(a.charAt(i)));
                if (value) {
                    //add string to list
                    substrings.add(temp1);
                    temp1 = "";
                    temp1 = temp1 + a.charAt(i);
                } else {
                    temp1 = temp1 + a.charAt(i);
                }
            } */
        }

    }

    public int higheststring(String a) {
        int x = 0;

        return x;
    }
}
