package LeetCodeInterviewbit;

import java.util.Scanner;

public class Lecture6Bitwise {
    public static void main(String ar[]) {
        byte a = 64, b;
        int i;
        i = a << 2; //left shift
        b = (byte) (a << 2);
        System.out.println(i);
        System.out.println("b: " + b);
        //
        int c = 5, d = 3;
        int result = c ^ d;
        System.out.println("result : " + result);
        int[] p = {1, 2, 2, 3, 1};
        int ans = 0, j;

        for (j = 0; j < p.length; j++) {
            ans = ans ^ p[j];
        }
        /*
        Scanner in = new Scanner(System.in);
        int ans = 0;
        if (A.length <= 2000000) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] <= Integer.MAX_VALUE && A[i]>0) {
                    A[i] = in.nextInt();
                }

            }
        }else {return ans};

        for (int s = 0; s < A.length; s++) {
            ans = ans ^ A[s];
        }
        return ans;
    } */
        /**
         * https://www.interviewbit.com/problems/pairs-with-given-xor/?authuser=0
         * Find Pairs With Given Xor
         * */
        Scanner scan = new Scanner(System.in);
        String l = scan.nextLine();
        String[] arr = l.split(" ");
        //  List<Integer> asap = new ArrayList<>();
        int[] A = new int[arr.length];
        for (int n = 0; n < arr.length; n++) {
            A[n] = Integer.parseInt(arr[n]);
        }
        int B = scan.nextInt(), output = 0, count = 0;

        for (int n = 0; n < A.length; n++) { //5 4 10 15 7 6
            //17 18  8 13 15 7 11 5 4 9 12 6 10 14 16 3

            output = B ^ A[n];
            System.out.println("output :" + output);
            for (j = 0; j < A.length; j++) {
                if (output == A[j])
                    count++;
                System.out.println("count :" + count);
            }

        }
        System.out.println("count :" + count / 2);
        //failed in case of large inputs check with pointer techniques to solve try once or mail
        /**
         * https://www.interviewbit.com/problems/min-xor-value/?authuser=0
         * Program 2
         * */

        /**
         * https://www.interviewbit.com/problems/reverse-bits/?authuser=0
         * Program 3
         * */
    }


}

