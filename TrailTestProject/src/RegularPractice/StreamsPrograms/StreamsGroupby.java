package RegularPractice.StreamsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamsGroupby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> obj = () -> Math.random();
		System.out.println(obj.get());

		Consumer<Integer> cons = (a) -> a = a + a;
		cons.accept(10);
		System.out.println();
		List<Integer> tst = Arrays.asList(1, 5, 6);

		List<Student> studlist = new ArrayList<>();
		studlist.add(new Student(1, 25, "Rima"));
		studlist.add(new Student(9, 23, "Rima"));
		studlist.add(new Student(2, 25, "banu"));
		studlist.add(new Student(8, 30, "Rima"));
		studlist.add(new Student(3, 26, "shika"));
		studlist.add(new Student(7, 22, "Rima"));
		studlist.add(new Student(4, 26, "dipti"));
		studlist.add(new Student(6, 22, "Rima"));
		studlist.add(new Student(5, 23, "soumya"));
		studlist.add(new Student(6, 22, "Rima"));

		// Get a list in group by manner

		Map<Integer, List<Student>> map1 = studlist.stream().collect(Collectors.groupingBy(stud -> stud.getAge()));
		map1.forEach((key, value) -> System.out.println(key + ": " + value));

		System.out.println("--------------------- added to set and removed duplicate and sort----------------------------- ");
		// also we can remove any duplicate entry if we have from this using SET
		Map<Integer, Set<Student>> map2 = studlist.stream()
				.collect(Collectors.groupingBy(stud -> stud.getAge(), TreeMap::new, Collectors.toSet()));
		map2.forEach((key, value) -> System.out.println(key + ": " + value));
		// now 
		System.out.println("--------------------- ----------------------------- ");

	}

}

