package LeetCodeInterviewbit;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://www.interviewbit.com/problems/nearest-smaller-element/
 */
public class NearestSmallestNoInterviewbit {
    public static void main(String[] args) {
        Integer[] A = new Integer[]{60, 11, 3, 6, 56, 10, 40, 12};
        Integer[] B = new Integer[0];
        List<Integer> list=new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (i > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (A[j] > A[i]) {
                        if(stack.empty()){
                            list.add(-1);
                        }else{
                            stack.pop();
                           // list.add(-1);
                            //B[i] = -1;
                        }

                    } else {
                        list.add(A[i]);
                        //B[i] = A[j];
                        stack.push(A[j]);
                    }
                }
            } else {
                stack.push(A[i]);
                list.add(-1);
                //B[i] = -1;
            }
        }
    }
}
