package RegularPractice.StreamsPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermidiateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.filter
		List<String> strlist = Arrays.asList("janvi", "ron", "davis", "simon", "paul", "harry");
		System.out.println(strlist.stream().filter(ob -> ob.length() > 4).toList());
		// 2.MAP
		System.out.println();
		// 3 .Sorted

		// 4. Skip
		// 5.Distinct
		// 6. Limit

		// 7.Peek
		System.out.println("7. Peek -:");
		Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

		// 8 - FLAT MAP handle stream where individual element as list it will flatten
		// it and transform it
		List<List<String>> listoflist = Arrays.asList(Arrays.asList("Mango", "jam"), Arrays.asList("orange", "apple"),
				Arrays.asList("kiwi", "custard"));
		
		
		System.out.println(listoflist.get(1).get(1));
		System.out.println("Map is flattened and diltered : "+listoflist.stream().flatMap(x->x.stream()).filter(o->o.contains("e")).toList());
	
		//****** stream cannot be used after the terminal operation is done  VV IMP
		//9 for each ordered
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,46);
		list.parallelStream().forEach(System.out::println);
		System.out.println("------for each ordered---");
		list.parallelStream().forEachOrdered(System.out::println);
		
	}

}
