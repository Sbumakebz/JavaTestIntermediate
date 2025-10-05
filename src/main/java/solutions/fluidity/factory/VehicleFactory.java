package solutions.fluidity.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import solutions.fluidity.core.Vehicle;

@Component
public class VehicleFactory {

    @Autowired
    private ApplicationContext context;

    public Vehicle createVehicle(String type) {
        if (!context.containsBean(type)) {
            throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
        return (Vehicle) context.getBean(type);
    }
}
