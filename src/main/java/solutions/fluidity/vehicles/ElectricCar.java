package solutions.fluidity.vehicles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solutions.fluidity.core.AbstractVehicle;
import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricCar extends AbstractVehicle {

    private static final Logger log = LoggerFactory.getLogger(ElectricCar.class);

    @Override
    public void drive() {
        log.info("Driving electric car silently...");
    }

    @Override
    protected int getMaxCargoCapacity() {
        return 500;
    }

    public void rechargeBattery() {
        log.info("Recharging battery...");
    }
}
