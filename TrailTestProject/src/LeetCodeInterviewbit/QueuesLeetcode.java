package LeetCodeInterviewbit;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class QueuesLeetcode {
    public static void main(String arg[]) {
        // Brute force solution
        Integer[] A = new Integer[]{1, 3, -1, 5, -3, 3, 6, 7};
        List<Integer> list = new ArrayList<>();
        int k = 3, startIndex = 0, endIndex = k - 1;
        int maxVal = 0;
        // window is k-1 in sliding window maximum
        while (endIndex < A.length) {
            for (int i = startIndex; i < endIndex; i++) {

                if (A[i] > A[i + 1]) {
                    maxVal = A[i];
                    list.add(maxVal);
                }

            }
            startIndex++;
            endIndex++;

        }
        // question solving using doubly queue
        //rules
        /**
         * 1.add new no at end of deque
         * 2.Remove new no from front and out of range no
         * 3. we will not use nos but indices in deque
         * 4. deleted all nos(indices) from deque which are less than the current i no
         *
         * */
        int storeno=0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < A.length; i++) {

            if(deque.isEmpty()) {
                storeno = A[i];
                deque.add(i);
            }else{
                if(storeno<A[i]){
                    storeno=A[i];
                    deque.removeLast();
                    deque.add(i);
                }
            }


        }


    }
}
