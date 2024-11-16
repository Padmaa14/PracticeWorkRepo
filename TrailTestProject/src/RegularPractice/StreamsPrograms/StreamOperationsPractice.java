package RegularPractice.StreamsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamOperationsPractice {
	public static void main(String arg[]) {
		// reduce
		List<Employee> traineesList = new ArrayList<>();
		traineesList.add(new Employee(1, 30, 50500, "F", "rathi jain", "VC"));
		traineesList.add(new Employee(2, 22, 22500, "M", "Pritesh", "Trainer"));
		traineesList.add(new Employee(3, 26, 35500, "M", "kunal", "Manager"));
		traineesList.add(new Employee(4, 22, 33500, "F", "Swathi", "Manager"));
		traineesList.add(new Employee(5, 26, 28500, "F", "Aditi M", "Trainer"));
		traineesList.add(new Employee(6, 23, 28500, "M", "junha jain", "Trainer"));
		List<Integer> nos = Arrays.asList(25, 6, 5, 6, 5, 6, 5);
		Integer ans = nos.stream().reduce(0, (a, b) -> a + b);
		Integer ans2 = nos.stream().mapToInt(a -> a).sum();
		System.out.println("ansss : " + ans + " ans2: " + ans2);

		Double salaryInvested = traineesList.stream().map(emp -> emp.getSalary()).mapToDouble(salobj -> salobj).sum();
		System.out.println("sum of salary : " + salaryInvested);

		/// parallel streams
		long start = 0, end = 0;
		start = System.currentTimeMillis();
		IntStream.range(1, 1500).forEach(System.out::print);
		end = System.currentTimeMillis();
		System.out.println("--------------------------------------");
		System.out.println("time taken diffrence " + (end - start));
		System.out.println("--------------------------------------");
		start = System.currentTimeMillis();
		IntStream.range(1, 1500).parallel().forEach(System.out::print);
		end = System.currentTimeMillis();
		System.out.println("--------------------------------------");
		System.out.println("time taken diffrence : " + (end - start));

		List<Integer> numbers = Arrays.asList(25, 6, 5, 6, 5, 6, 5);
		// numbers.stream().max()

	}

}

