package solutions.fluidity.vehicles;

import solutions.fluidity.core.AbstractVehicle;
import solutions.fluidity.core.FuelPowered;

public class Truck extends AbstractVehicle implements FuelPowered {
    @Override
    protected int getMaxCargoCapacity() {
        return 0;
    }

    @Override
    public void changeOil() {
        System.out.println("Changing truck oil...");
    }

    @Override
    public void fillUpFuel() {
        System.out.println("Filling diesel tank...");
    }

    @Override
    public void drive() {
        System.out.println("Driving heavy-duty truck...");
    }
}
