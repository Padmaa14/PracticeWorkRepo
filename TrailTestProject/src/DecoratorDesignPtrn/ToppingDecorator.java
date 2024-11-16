package DecoratorDesignPtrn;

public abstract class ToppingDecorator extends BasePizza{ //forming is-A relationship
}
class Extracheese extends ToppingDecorator{

    BasePizza basePizza; // we are creating  HAS-A relationship because its pizza as well
    Extracheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int pizzaCost() {
        return this.basePizza.pizzaCost()+100;
    }
}
class Jalepino extends ToppingDecorator{

    BasePizza basePizza;
    Jalepino(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int pizzaCost() {
        return this.basePizza.pizzaCost()+100;
    }
}
class Sausage extends ToppingDecorator{

    BasePizza basePizza;
    Sausage(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int pizzaCost() {
        return this.basePizza.pizzaCost()+100;
    }
}
