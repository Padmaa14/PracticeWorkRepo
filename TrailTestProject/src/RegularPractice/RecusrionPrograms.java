package RegularPractice;

public class RecusrionPrograms {

	public static void main(String[] args) {
		int number = 5;
		int arr[] = { 1, 5, 5, 5 };
		String str = "cinnamon";

		printFacorialUsingRecursion(number);
		sumOfArrayUsingResursion(arr);
		int len = str.length();
		len = len - 1;
		String newstr = reverseString(str, len);
		System.out.println(newstr);

	}

	private static String reverseString(String str, int len) {
		if (len == -1) {
			return "";
		}
		char c;
		c = str.charAt(len);
		String added = c + "";
		return added + reverseString(str, len - 1);
	}

	private static void sumOfArrayUsingResursion(int[] arr) {
		System.out.println("----------- sum of array using recusrion -----");
		int len = arr.length - 1;
		int result = 0;
		result = recursiveSumOfArray(arr, len);
		System.out.println(result);

	}

	private static int recursiveSumOfArray(int[] arr, int i) {

		if (i == -1) {
			return 0;
		}

		return arr[i] + recursiveSumOfArray(arr, (i - 1));

	}

	private static void printFacorialUsingRecursion(int number) {
		System.out.println("------------- Facorial using recusrion---------");
		int result = 0;
		result = recursiveFactorial(number);
		System.out.println(result);

		System.out.println("-----------------------------------------------");

	}

	private static int recursiveFactorial(int number) {
		int fact = 1;
		if (number == 0 || number == 1) {
			return 1;
		}
		return fact = number * recursiveFactorial((number - 1));

	}

}
