package FactoryDesignPatternBasic;

public class FactoryDesignMain {
    public static void main(String args[]){
        ShapeFactory shapefactobj=new ShapeFactory();
        Shape shape=shapefactobj.getshape("Rectangle");
        shape.draw();
    }
}
