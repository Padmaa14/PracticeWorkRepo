package LeetCodeInterviewbit;

import java.util.*;

public class InterviewbitXORPairs {
    public static void main(String[] args) {
        //17 18 8 13 15 7 11 5 4 9 12 6 10 14 16 3
        Scanner scan = new Scanner(System.in);
        String l = scan.nextLine();
        String[] arr = l.split(" ");
        //  List<Integer> asap = new ArrayList<>();
        Integer[] A = new Integer[arr.length];
        for (int n = 0; n < arr.length; n++) {
            A[n] = Integer.parseInt(arr[n]);
        }

        int B = scan.nextInt(), output = 0, count = 0;
        Set<Integer> setA = new HashSet<>();
        setA.addAll(Arrays.asList(A));
        for (int i = 0; i < A.length; i++) {
            output = B ^ A[i];
            if (!setA.contains(output))
                count++;
            else
                setA.add(A[i]);

        }
        System.out.println("count : " + count);
    }
}
