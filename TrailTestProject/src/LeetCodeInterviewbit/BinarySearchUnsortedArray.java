package LeetCodeInterviewbit;

public class BinarySearchUnsortedArray {
    public static void main(String[] args) {
        //new technique of binary search
        //int startIndex = 0, endIndex = Ab.length - 1, number = 6, mid = 0, Temp = -1;
        //find first and last occurrences of number
        Integer[] A = new Integer[]{5, 7, 7, 8, 8, 10};
        int target = 11;
        searchRange(A, target);

    }

    public static Integer[] searchRange(Integer[] nums, int target) {
        int startIndex = 0, endIndex = nums.length - 1, mid = 0, first_Occurrence = -1;

        while (startIndex <= endIndex) {
            mid = startIndex + (endIndex - startIndex) / 2;
            if (nums[mid] < target) {
                startIndex = mid + 1;
            } else if (nums[mid] == target) {
                first_Occurrence = mid;
                endIndex = mid - 1;
            } else {
                endIndex = mid - 1;
            }

        }
        System.out.println("First occurrence at index :" + first_Occurrence);
        //Last occurrence of number
        int last_Occurrence = -1;
        mid = 0;
        startIndex = 0;
        endIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            mid = startIndex + (endIndex - startIndex) / 2;
            if (nums[mid] == target) {
                last_Occurrence = mid;
                startIndex = mid + 1;
            } else if (nums[mid] < target) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;

            }
        }
        System.out.println("Last occurrence at index :" + last_Occurrence);
        Integer[] B = new Integer[]{first_Occurrence, last_Occurrence};
        int[] Bc = new int[]{first_Occurrence, last_Occurrence};
        return B;
    }
}
