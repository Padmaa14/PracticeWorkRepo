package AbstractFactory;

public class RegularFruitFactory extends AbstractFactory {

    @Override
    FruitType getFruitType(String fruitType) {
        if (fruitType.equalsIgnoreCase("raw"))
            return new Rawfruit();
        else if (fruitType.equalsIgnoreCase("ripe"))
            return new RipeFruit();
        else
            return null;
    }
}
