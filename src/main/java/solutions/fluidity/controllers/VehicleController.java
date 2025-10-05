package solutions.fluidity.controllers;

import org.springframework.web.bind.annotation.*;
import solutions.fluidity.core.Vehicle;
import solutions.fluidity.factory.VehicleFactory;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleFactory vehicleFactory;

    public VehicleController(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    @PostMapping("/{type}/cargo/{kgs}")
    public String addCargo(@PathVariable String type, @PathVariable int kgs) {
        Vehicle vehicle = vehicleFactory.createVehicle(type);
        vehicle.addCargo(kgs);
        return vehicle.printStats();
    }

    @GetMapping("/{type}/drive")
    public String drive(@PathVariable String type) {
        Vehicle vehicle = vehicleFactory.createVehicle(type);
        vehicle.drive();
        return type + " is now driving!";
    }
}
