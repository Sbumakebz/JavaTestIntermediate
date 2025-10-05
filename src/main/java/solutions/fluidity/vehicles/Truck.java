package solutions.fluidity.vehicles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solutions.fluidity.core.AbstractVehicle;
import solutions.fluidity.core.FuelPowered;
import org.springframework.stereotype.Component;

@Component("truck")
public class Truck extends AbstractVehicle implements FuelPowered {

    private static final Logger log = LoggerFactory.getLogger(Truck.class);

    @Override
    public void drive() {
        log.info("Driving heavy-duty truck...");
    }

    @Override
    protected int getMaxCargoCapacity() {
        return 18000;
    }

    @Override
    public void fillUpFuel() {
        log.info("Filling diesel tank...");
    }

    @Override
    public void changeOil() {
        log.info("Changing truck oil...");
    }
}
