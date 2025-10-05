package solutions.fluidity.vehicles;

import solutions.fluidity.core.AbstractVehicle;
import solutions.fluidity.core.FuelPowered;

public class Car extends AbstractVehicle implements FuelPowered {
    @Override
    protected int getMaxCargoCapacity() {
        return 500;
    }

    @Override
    public void fillUpFuel() {
        System.out.println("Filling petrol tank...");
    }

    @Override
    public void changeOil() {
        System.out.println("Changing engine oil...");
    }

    @Override
    public void drive() {
        System.out.println("Driving petrol car...");
    }
}
