package solutions.fluidity.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import solutions.fluidity.core.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
class VehicleFactoryTest {

    @Autowired
    private VehicleFactory vehicleFactory;

    @Test
    void testCreateCar() {
        Vehicle car = vehicleFactory.createVehicle("car");
        assertNotNull(car);
        assertEquals("Car", car.getClass().getSimpleName());
    }

    @Test
    void testCreateTruck() {
        Vehicle truck = vehicleFactory.createVehicle("truck");
        assertNotNull(truck);
        assertEquals("Truck", truck.getClass().getSimpleName());
    }

    @Test
    void testInvalidVehicleThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            vehicleFactory.createVehicle("spaceship");
        });
    }
}
