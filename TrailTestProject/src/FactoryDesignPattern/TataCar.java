package FactoryDesignPattern;

public class TataCar implements Vehicle{
    @Override
    public void vehicleDetails() {
        System.out.println("Its TATA AV 55 With nostalgic old gold design");
    }

    @Override
    public void vehicleRoadPrice() {
        System.out.println("5 Crore including taxes ");
    }
}
