package LeetCodeInterviewbit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnagramUsingHashMap {
    public static void main(String[] args) {
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        String s = "preeti", t = "eeprtt";
        String a = "";
        int d = 0;
        char[] c = s.toCharArray(); //way to initialize char
        for (int i = 0; i < c.length; i++) {
            char cs = c[i];
            if (mapA.containsKey(cs)) {
                d = 1;
                int val = mapA.get(cs);
                mapA.put(cs, val + 1);

            } else {
                d = d + 1;
                mapA.put(cs, d);
            }
            d = 0;
        }

        for (Map.Entry<Character, Integer> as : mapA.entrySet()) {
            System.out.println(as.getKey() + " " + as.getValue());
        }
        a = "";
        System.out.println("------------------- ");
        c = t.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            char cs = c[i];
            if (mapB.containsKey(cs)) {
                d = 1;
                int val = mapB.get(cs);
                mapB.put(cs, val + 1);

            } else {
                d = d + 1;
                mapB.put(cs, d);
            }
            d = 0;
        }
        for (Map.Entry<Character, Integer> as : mapB.entrySet()) {
            System.out.println(as.getKey() + " " + as.getValue());
        }
        boolean flag = mapA.equals(mapB);
        if (flag)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
