package RegularPractice.StreamsPrograms;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectorsPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// as collectors we can collect to list and set also we can add it to some
		// collection
		List<Integer> list = Arrays.asList(5, 6, 9, 8, 2, 6);
		List<String> strs = Arrays.asList("bob", "diana", "ron", "rima", "eadhaal", "Ezeikeil", "lee", "jacksimon");
		ArrayDeque<String> arrd = strs.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
		System.out.println("arrayDeque: " + arrd);

		// 2. joining strings
		// concatenates stream elements in single string
		String s = strs.stream().map(String::toUpperCase).collect(Collectors.joining());
		System.out.println("collectors.joining() without any seperator :" + s);
		String s1 = strs.stream().map(String::toUpperCase).collect(Collectors.joining(" , "));
		System.out.println("collectors.joining() with seperator :" + s1);

		// 3. Summarizing data
		// Generates statistical summary (count,sum,min,average, max)
		IntSummaryStatistics summaryint = list.stream().collect(Collectors.summarizingInt(x -> x));
		System.out.println(" summarizingInt eg: Average : " + summaryint.getAverage() + " Count : "
				+ summaryint.getCount() + " Max : " + summaryint.getMax());
		System.out.println("sum : " + summaryint.getSum() + " Min : " + summaryint.getMin());

		// 4.averaging
		Double dou = list.stream().collect(Collectors.averagingDouble(x -> x));
		System.out.println(" average " + dou);

		// 5. collectors.counting
		System.out.println(" counting: " + strs.stream().collect(Collectors.counting()));

		// 6 .Grouping elements and counting them according to len and store in map
		System.out.println("grouping by lengths: " + strs.stream().collect(Collectors.groupingBy(x -> x.length())));
		System.out.println("grouping by lengths: " + strs.stream().collect(Collectors.groupingBy(String::length))); // same
																													// but
																													// using
																													// method
																													// refrences
		System.out.println("grouping and joining :"
				+ strs.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
		System.out.println("grouping and counting :"
				+ strs.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));

		System.out.println("grouping and TreeMAP or collecton :"
				+ strs.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting())));

		// 7. Partitioning elements
		// partition elements in 2 groups

		System.out.println(" collectors partitioniongBy :"
				+ strs.stream().collect(Collectors.partitioningBy(x -> x.contains("e"))));

		// 8.Mapping and collecting
		// applies a mapping function before collecting
		System.out.println(" mapping and collecting: "
				+ strs.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

		// TODO :Examples
		// group nby length
		List<String> str = Arrays.asList("suzuki", "kia", "alto", "bravia", "wagonr", "innova", "gatsby");
		str.stream().collect(Collectors.groupingBy(String::length));
		// counting word occurence
		String pr = "hello therr hello world me to me i am fine world";

		// just we returned as hasmap
		System.out.println("counting thr word occurence");
		Map<Object, Long> hashmap = Arrays.stream(pr.split(" "))
				.collect(Collectors.groupingBy(x -> x, HashMap::new, Collectors.counting()));
		System.out.println(hashmap);

		// collect even and odd partitioning,
		List<Integer> lis = Arrays.asList(12, 5, 163, 4, 12, 56);
		System.out.println("Even odd partition: " + lis.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

		// Summing values in map
		HashMap<String, Integer> map = new HashMap<>();
		map.put("mango", 5);
		map.put("orange", 5);
		map.put("kiwi", 5);
		System.out.println("SUMMING : " + map.values().stream().reduce(Integer::sum));
		System.out.print("SUMMING INT : " + map.values().stream().collect(Collectors.summingInt(x -> x)));

		// add name and its length using TOMAP
		Set<String> keys = map.keySet();
		keys.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())); ///// important one

		// Example words count in list
		List<String> fruits = Arrays.asList("Apple", "banana", "kivi", "Apple", "banana", "kivi", "mango");
		System.out.println("FRUITS using map and its merge function : "+fruits.stream().collect(Collectors.toMap(k -> k, v -> 1, (z, y) -> z + y)));
	}

}
