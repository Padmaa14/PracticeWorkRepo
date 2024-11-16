package LeetCodeInterviewbit;

public class BinarySearch {
    public static void main(String[] args) {
        Integer[] A = new Integer[]{-60, 1, 3, 6, 8, 10, 12, 100};
        //Binary search
        int startIndex = 0, endIndex = A.length - 1, number = 6, mid = 0;
        while (startIndex <= endIndex) {
            mid = (startIndex + endIndex) / 2;
            if (A[mid] < number) {

                startIndex = mid + 1;
            } else if (A[mid] > number) {
                endIndex = mid - 1;
            } else if (number == A[mid]) {
                System.out.println("Yes no is Present");
                break;
            }
        }
        if (startIndex >= endIndex) {
            System.out.println("no is not Present");

        }
    }
}