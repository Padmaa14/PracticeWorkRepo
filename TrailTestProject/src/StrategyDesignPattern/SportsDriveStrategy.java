package StrategyDesignPattern;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sport Drive strategy ");
    }
}
