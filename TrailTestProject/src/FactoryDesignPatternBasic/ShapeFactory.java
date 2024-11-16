package FactoryDesignPatternBasic;

public class ShapeFactory {

     Shape getshape(String input){
        switch(input){
            case "Rectangle","RECTANGLE":
                return new Rectangle();
            case "Square","SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
