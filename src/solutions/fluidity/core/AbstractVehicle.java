package solutions.fluidity.core;

public abstract class AbstractVehicle implements Vehicle {
    protected int cargoSpace;

    @Override
    public void addCargo(int kgs) {
        if (kgs > getMaxCargoCapacity()) {
            throw new IllegalArgumentException("too heavy");
        }
        this.cargoSpace = kgs;
    }

    protected abstract int getMaxCargoCapacity();

    @Override
    public void printStats() {
        System.out.println(getClass().getSimpleName() + " cargo: " + cargoSpace + "kg");
    }
}
