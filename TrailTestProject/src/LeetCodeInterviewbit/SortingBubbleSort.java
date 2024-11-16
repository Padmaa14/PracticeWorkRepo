package LeetCodeInterviewbit;

public class SortingBubbleSort {
    /** TODO : Selection and insertion sort
     * This algorithm will give us O(n square) time complexity which is not fair, this can be used for smaller datasets
     *
     * */
    public static void main(String[] args) {
        Integer[] A = new Integer[]{60, 11, 3, 6, 56, 10, 40, 12};
        int len = A.length;
        //Bubble sort Technique
        int temp = 0;
        for (int s = 0; s < len; s++) {
            for (int i = 1; i <= len - 1; i++) {
                int j = A[i], q = A[i - 1];
                // System.out.println("q : " + i + "  " + A[i] + "     j : " + A[i - 1] + " " + (i - 1));
                if (j < q) {
                    A[i] = q;
                    A[i - 1] = j;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(" " + A[i]);
        }

    }
}
