package RegularPractice.StreamsPrograms;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// factorial of numbers
		long starttime = System.currentTimeMillis();
		List<Integer> listofints = Stream.iterate(1, x -> x + 1).limit(20000).toList();
		List<Long> factorials=listofints.stream().map(ParallelStream::factori).toList();
		long endtime = System.currentTimeMillis();
		long timeconsemed = endtime - starttime;
		System.out.println("time taken: " + timeconsemed);
		
		 starttime = System.currentTimeMillis();
		List<Integer> listo = Stream.iterate(1, x -> x + 1).limit(20000).toList();
		List<Long> factorial=listo.parallelStream().map(ParallelStream::factori).toList();
		 endtime = System.currentTimeMillis();
		 timeconsemed = endtime - starttime;
		System.out.println("time taken: " + timeconsemed);

	}

	private static long factori(int n) {
		// TODO Auto-generated method stub
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
