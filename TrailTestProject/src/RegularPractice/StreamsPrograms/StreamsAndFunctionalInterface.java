package RegularPractice.StreamsPrograms;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamsAndFunctionalInterface {
	public static void main(String s[]) {

		//
		Thread t1 = new Thread(new Task());
		System.out.print(System.currentTimeMillis());
		t1.start();
		System.out.print(System.currentTimeMillis());
		// convert to lambda expression
		Thread t2 = new Thread(() -> {
			System.out.println("run in lambda");
		});
		t2.start();
		StringOperation obj = (a) -> {
			return a + " number " + a * a;
		};
		System.out.println(obj.operate(10));
		StringOperation obj2 = (a) -> {
			return a + " number " + (a + a);
		};
		System.out.println(obj2.operate(10));
		Predicate<Integer> testem = x -> x < 100;
		System.out.println(testem.test(101));
		Predicate<String> strs = (x) -> x.startsWith("Z") || x.endsWith("k");
		System.out.println(strs.test("zopk"));

		// Function
		Function<Integer, Integer> f1 = (z) -> z * 10 + 11;
		System.out.println(f1.apply(8));
		Function<Integer, Integer> f2 = (z) -> z * 10 - 11;
		System.out.println("use of 'x.andThen(y).apply(T)' default methods :" + f1.andThen(f2).apply(6));
		System.out.println("use of 'x.andThen(y).apply(T)' default methods :" + f2.compose(f1).apply(6));

		// function identity :- jo aap bbhejoge vahi return ho-jayega
		Function<Integer, Integer> funct = Function.identity();
		System.out.println("function ifrntity :" + funct.apply(7));

		// Consumer khayega return nahi karega
		Consumer<Integer> om = p -> System.out.println(p + p);
		om.accept(6);

		// supplier - leta nahi hai deta hai
		// no defsult methods
		Predicate<Integer> predicate = x -> x > 10;
		Function<Integer, Integer> function = f -> f * f;
		Supplier<Integer> supplier = () -> 16;
		Consumer<Integer> consumer = (o) -> System.out.println("consumed : " + o);

		if (predicate.test(supplier.get())) {
			consumer.accept(function.apply(supplier.get()));
		}
		
		BiPredicate<Integer, Integer> bipr=(a1,a2)-> a1 <= a2;
		System.out.print(bipr.test(5, 4));
		
		BiConsumer<Integer,String> bico=(x,y)->{
			System.out.println(" Added to db and list : "+x);
			System.out.println(" Added to db and list : "+y);
		};
		bico.accept(5,"sima");
		BiFunction<String,String,Integer> bifun=(p,q)->{
			return p.concat(q).length();
		};
		System.out.println(" BiFunction : "+bifun.apply("sima", "masi"));
		
		//unary and binary operator  aram keliye 
		
		//method references
		
		
		
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
			System.out.print(" " + i);

	}
}

interface StringOperation {
	public String operate(int string);
}
