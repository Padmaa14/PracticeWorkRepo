package RegularPractice;

public class AbstractClasstest extends Testers {
	int local = 20;

	public int add(int local) {
		local = local;
		return local;
	}

	public void change(AbstractClasstest obj) {
		obj.local = obj.local + 50;
	}

	public static void main(String arg[]) {

		test obj = (x) -> x * x;
		// System.out.print(obj.multiply(2));
		// Supplier<T> have get method
		// Consumer<T> have a accept(T t) method;
		// Function<T, R> have apply method
		AbstractClasstest object1 = new AbstractClasstest();
		System.out.println(object1.local);
		System.out.println(object1.add(40));
		System.out.println(object1.local);

		object1.change(object1);
		System.out.println("after change: " + object1.local);

		Testt t1 = new Testt();
		Derived d = new Derived();
		Testt t2 = new Derived();
		t1.testMethod(10); // Test class method called with integer a = 10
		t1.testMethod(10.0);// Test class method called with double b = 10.0
		d.testMethod(10); // Test class method called with integer a 10
		d.testMethod(10.0);// "Derived class method called with double c = 10.0

		t2.testMethod(10); // Test class method called with integer a 10
		t2.testMethod(10.0); // "Derived class method called with double c = 10.0

	}

	@Override
	public String testmethod() {
		// TODO Auto-generated method stub
		return "Julie";
	}

}

abstract class Testers {
	abstract public String testmethod();
}

@FunctionalInterface
interface test {
	public int multiply(int i);
}

class Testt {
	void testMethod(int a) {

		System.out.println("Test class method called with integer a = " + a);
	}

	void testMethod(double b) {
		System.out.println("Test class method called with double b =" + b);
	}
}

class Derived extends Testt {
	void testMethod(double c) {

		System.out.println("Derived class method called with double c =" + c);
	}

}
