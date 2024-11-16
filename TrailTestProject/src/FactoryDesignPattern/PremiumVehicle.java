package FactoryDesignPattern;

//concrete factory
 class PremiumVehicle implements VehicleFactory {

    @Override
    public Vehicle getVehicleType() {
        return (Vehicle) new PremiumVehicle();
    }
}
