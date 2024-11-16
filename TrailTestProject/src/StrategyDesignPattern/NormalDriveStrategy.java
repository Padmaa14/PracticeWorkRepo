package StrategyDesignPattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println(" drive strategy : NormalDriveStrategy");
    }
}
