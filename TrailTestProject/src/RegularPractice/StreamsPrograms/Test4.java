package RegularPractice.StreamsPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pre = p1 -> p1 > 5;
		pre.test(6);
		System.out.println(pre.test(6));
		List<String> list = Arrays.asList("this", "is", "padmaj");
		OptionalInt max = list.stream().mapToInt(a1 -> a1.length()).max();
		System.out.print(max.getAsInt());

		String a = "Padmaja";
		Map<Integer, Character> mapd = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			mapd.put(i, c);
		}
		System.out.println(mapd);
		Map<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			int z = 0;
			if (map2.containsKey(c)) {
				map2.put(c, z);
			} else {
				map2.put(c, 1);
			}
		}
		System.out.println(map2);
	}

}
