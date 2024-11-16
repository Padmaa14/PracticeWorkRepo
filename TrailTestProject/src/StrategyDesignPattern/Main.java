package StrategyDesignPattern;

public class Main {
    public static void main(String arg[]) {
        Vehicle vehicle=new GoodsVehicle();
        vehicle.drive();
        Vehicle vehicle2=new SportsVehicle();
        vehicle2.drive();
    }
}
