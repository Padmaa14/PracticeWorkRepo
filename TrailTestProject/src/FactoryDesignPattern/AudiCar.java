package FactoryDesignPattern;

public class AudiCar implements Vehicle{
    @Override
    public void vehicleDetails() {
        System.out.println("Premium Audi k series car ");
    }

    @Override
    public void vehicleRoadPrice() {
        System.out.println("80 Lacs including taxes ");

    }
}
