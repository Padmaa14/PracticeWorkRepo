package DecoratorDesignPtrn;

public class PizzaShopMainclass {
    public static void main(String arg[]){
        BasePizza base= new Extracheese(new MargaritaPizza());
        System.out.println("Pizza with Extra cheese cost :"+base.pizzaCost());
        BasePizza base1= new Jalepino(new Extracheese(new CheesyPaneerPizza()));
        System.out.println("CheesyPaneerPizza with Extra cheese cost :"+base1.pizzaCost());
        BasePizza base2= new Jalepino(new MargaritaPizza());
        System.out.println("MargaritaPizza with Jalepino cost :"+base2.pizzaCost());
        BasePizza base3= new Sausage(new VegdelightPizza());
        System.out.println("VegdelightPizza with Sausage cost :"+base3.pizzaCost());
        BasePizza base4= new Extracheese(new Jalepino(new VegdelightPizza()));
        System.out.println("VegdelightPizza with Cheese,Jalepino cost :"+base4.pizzaCost());
        BasePizza base5= new Extracheese(new CheesyPaneerPizza());
        System.out.println("CheesyPaneer with Extra cheese cost :"+base5.pizzaCost());
    }
}
