package AbstractFactory;

public class FruitfactoryMainclass {
	public static void main(String args[]) {
		// AbstractFactoryClient is one abstract factory
		AbstractFactory abstractFactory = AbstractFactoryClient.getMyFruit("regular");
		//AbstractFactory is one factory
		FruitType fruitType = abstractFactory.getFruitType("raw");
		System.out.println("Price is : " + fruitType.price());
	}
}
