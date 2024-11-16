package LeetCodeInterviewbit;

public class SortingDutchFlagAlgo {
    /**
     * https://leetcode.com/problems/sort-colors/description/
     * we can use Arrays.sort which takes  O(n log n) complexity
     * for this question we constraint is not to use ready algo
     */
    public static void main(String[] args) { //failed 2,0,2,1,1,0
        Integer[] nums = new Integer[]{1, 1, 0, 1, 2, 0, 1, 2, 0}; // 1, 1, 0, 1, 2, 0, 1, 2, 0 passed
        int start = 0, end = nums.length - 1, pointer = 0, swap = 0;
        System.out.println("Start : "+start+" End : "+end);
        for (int i = 0; i < nums.length; i++) {
            if(end != pointer) {
                if (nums[pointer] == 0) {
                    swap = nums[pointer];
                    nums[pointer] = nums[start];
                    nums[start] = swap;
                    start++;
                    pointer++;
                   // end--; //if i remove this output is correct


                } else if (nums[pointer] == 2) {
                    swap = nums[pointer];
                    nums[pointer] = nums[end];
                    nums[end] = swap;
                    end--;
                   // start++;
                    pointer++;
                } else if (nums[pointer] == 1) {
                    pointer++;
                }
            }else{
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
