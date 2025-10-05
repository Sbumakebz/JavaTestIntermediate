package solutions.fluidity.vehicles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solutions.fluidity.core.AbstractVehicle;
import solutions.fluidity.core.FuelPowered;
import org.springframework.stereotype.Component;

@Component("car")
public class Car extends AbstractVehicle implements FuelPowered {

    private static final Logger log = LoggerFactory.getLogger(Car.class);

    @Override
    public void drive() {
        log.info("Driving petrol car...");
    }

    @Override
    protected int getMaxCargoCapacity() {
        return 500;
    }

    @Override
    public void fillUpFuel() {
        log.info("Filling petrol tank...");
    }

    @Override
    public void changeOil() {
        log.info("Changing engine oil...");
    }
}
