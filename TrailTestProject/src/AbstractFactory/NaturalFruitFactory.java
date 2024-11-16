package AbstractFactory;

public class NaturalFruitFactory extends AbstractFactory{

    @Override
    FruitType getFruitType(String fruitType) {
        if (fruitType.equalsIgnoreCase("raw"))
            return new NaturalRawFruit();
        else if (fruitType.equalsIgnoreCase("ripe"))
            return new NaturalRipeFruit();
        else
            return null;
    }
}
