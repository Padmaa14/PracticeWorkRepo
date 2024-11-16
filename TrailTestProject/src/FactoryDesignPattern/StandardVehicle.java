package FactoryDesignPattern;

//concrete factory
public class StandardVehicle implements VehicleFactory{

    @Override
    public Vehicle getVehicleType() {
        return (Vehicle) new StandardVehicle();
    }
}
