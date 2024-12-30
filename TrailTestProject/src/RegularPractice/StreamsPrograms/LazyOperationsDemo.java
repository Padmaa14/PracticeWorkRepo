package RegularPractice.StreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strlist = Arrays.asList("janvi", "ron", "davis", "simon", "paul", "harry");

		Stream s = strlist.stream().filter(name -> {
			System.out.println("filtering name " + name);

			return name.length() > 4;
		});
		System.out.println("before terminal operation");
		List<String> opp=s.toList();
		System.out.println("names : "+opp);
		
	}

}
