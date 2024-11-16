package LeetCodeInterviewbit;

import java.util.Scanner;

public class Lecture1Practice {
        public static void main(String[] args) {
        /**
        * https://www.codechef.com/practice/course/arrays/ARRAYS/problems/UWCOI20A?tab=hints
        * 
        * */
        Scanner in = new Scanner(System.in);
        int number = 0; //constraint
        int T = in.nextInt();//no of times testcase

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int num[] = new int[N];
            number=0;
            for (int j = 0; j < N; j++) {
                num[j] = in.nextInt();
                if (num[j] > number)
                    number = num[j];
            }
            System.out.println("tall mountain=" + number);
        }
        /**
         * Cost of Groceries
         * https://www.codechef.com/practice/course/arrays/ARRAYS/problems/KITCHENCOST?authuser=0&tab=statement
         *
         * */

        

    }

}
