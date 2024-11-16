package AbstractFactory;

public class AbstractFactoryClient {
    public static AbstractFactory getMyFruit(String fruit)//natural ya regular
    {
        if (fruit.equalsIgnoreCase("Regular"))
            return new RegularFruitFactory();
        else if (fruit.equalsIgnoreCase("natural"))
            return new NaturalFruitFactory();
        else
            return null;
    }
}
