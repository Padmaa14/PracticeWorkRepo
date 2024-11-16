package FactoryDesignPattern;

public class JguarCar implements Vehicle{
    @Override
    public void vehicleDetails() {
        System.out.println("Its Jaguar gold of Today !!!");
    }

    @Override
    public void vehicleRoadPrice() {
        System.out.println("5 Crore including taxes ");
    }
}
