package solutions.fluidity.vehicles;

import solutions.fluidity.core.AbstractVehicle;

public class ElectricCar extends AbstractVehicle {

    @Override
    protected int getMaxCargoCapacity() {
        return 500;
    }

    public void rechargeBattery() {
        System.out.println("Recharging battery...");
    }

    @Override
    public void drive() {
        System.out.println("Driving electric car silently...");
    }
}
