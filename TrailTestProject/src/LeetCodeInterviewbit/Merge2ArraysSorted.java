package LeetCodeInterviewbit;

public class Merge2ArraysSorted {
    public static void main(String[] args) {
        /**
         * int[] myIntArray = new int[3]; // each element of the array is initialised to 0
         * int[] myIntArray = {1, 2, 3};
         * int[] myIntArray = new int[]{1, 2, 3};
         *
         * // Since Java 8. Doc of IntStream: https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html
         *
         * int [] myIntArray = IntStream.range(0, 100).toArray(); // From 0 to 99
         * int [] myIntArray = IntStream.rangeClosed(0, 100).toArray(); // From 0 to 100
         * int [] myIntArray = IntStream.of(12,25,36,85,28,96,47).toArray(); // The order is preserved.
         * int [] myIntArray = IntStream.of(12,25,36,85,28,96,47).sorted().toArray(); // Sort
         * */
        /**
         * we need to merge 2 different arrays in sored order
         */

        Integer[] A = new Integer[]{5, 8, 10, 12};
        Integer[] B = new Integer[]{6, 9, 11, 15};

        int length = A.length + B.length;
        Integer[] C = new Integer[length];
        int p1 = 0, p2 = 0;

        for (int i = 0; i < length; i++) {
            if (p2 > B.length - 1) {
                C[i] = A[p1];
                System.out.print(" " + C[i]);
                break;
            } else if (p1 > A.length - 1) {
                C[i] = B[p2];
                System.out.print(" " + C[i]);
                break;
            }
            if (A[p1] < B[p2]) {
                C[i] = A[p1];
                p1++;
            } else if (A[p1] > B[p2]) {
                C[i] = B[p2];
                p2++;
            }

            System.out.print(" " + C[i]);
        }
    }
}
