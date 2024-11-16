package LeetCodeInterviewbit;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{2, 1, 2, 3, 1, 2, 4};
        Integer[] fillarray = new Integer[]{0, 0, 0, 0, 0};
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            fillarray[val]=fillarray[val]+1;

        }
        for(int i=0;i<fillarray.length;i++){
            System.out.println(i+" : "+fillarray[i]);

        }

    }
}
