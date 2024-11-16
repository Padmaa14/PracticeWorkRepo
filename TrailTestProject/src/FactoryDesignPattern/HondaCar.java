package FactoryDesignPattern;

public class HondaCar implements Vehicle{

    @Override
    public void vehicleDetails() {
        System.out.println("Its Honda Thunder777 design");
    }

    @Override
    public void vehicleRoadPrice() {
        System.out.println("10 Lacs including taxes ");
    }
}
