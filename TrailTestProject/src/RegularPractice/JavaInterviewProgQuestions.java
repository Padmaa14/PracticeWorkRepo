package RegularPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaInterviewProgQuestions {
	public static void main(String arg[]) {

		/*** optional methods use ***/
		Optional<Integer> val = Optional.of(6); // cannot keep this as null will throw nullpointer exception
		System.out.println(val);
		Optional<Integer> val2 = Optional.ofNullable(null); // use ofnullable in case where object may hold null value
		System.out.println(val2);
		/*** optional methods END ***/

		List<Integer> ls1 = Arrays.asList(6, 2, 5, 1);
		List<Integer> ls2 = Arrays.asList(5, 3, 7, 0, 1, 2);

		fetchCommonElementinArrayMethodA(ls1, ls2);
		System.out.println("----------------------");
		// Common elements between 2
		fetchCommonElementsinArrays(ls1, ls2);
		System.out.println("----------------------");
		int[] input1 = new int[] { 5, 4, 3, 2, 1 };
		reverseArrayInplace(input1);

	}

	private static void reverseArrayInplace(int[] input1) {
		// TODO Auto-generated method stub
		
	}

	private static void fetchCommonElementinArrayMethodA(List<Integer> ls1, List<Integer> ls2) {
		// TODO / Merge two arrays and show the repeated object in it
		// Collections.frequency(ls3, obj) > 1 shows repeated object
		// Collections.frequency(ls3, obj) == 1 removes repeated object
		List<Integer> ls3 = new ArrayList<>();
		ls3.addAll(ls1);
		ls3.addAll(ls2);
		List<Integer> lst = ls3.stream().filter(obj -> Collections.frequency(ls3, obj) > 1)
				.collect(Collectors.toList());
		lst.forEach(System.out::println);

	}


	private static void fetchCommonElementsinArrays(List<Integer> ls1, List<Integer> ls2) {

		List<Integer> list = ls1.stream().filter(obj -> ls2.stream().anyMatch(obj2 -> obj2.equals(obj)))
				.collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
