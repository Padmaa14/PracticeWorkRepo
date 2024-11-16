package StrategyDesignPattern;

public class OffroadVehicle extends Vehicle{
    OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
