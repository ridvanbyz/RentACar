import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

    List<Vehicle> rentedVehicles = new ArrayList<>();

    public void addRental(Vehicle vehicle) {
        rentedVehicles.add(vehicle);
    }

    public void rentVehicle(Vehicle vehicle) {
        if (!rentedVehicles.contains(vehicle)) {
            rentedVehicles.add(vehicle);
            System.out.println("Vehicle rented: " + vehicle.toString());
        } else {
            System.out.println("Vehicle is already rented.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        if (rentedVehicles.contains(vehicle)) {
            rentedVehicles.remove(vehicle);
            System.out.println("Vehicle returned: " + vehicle.toString());
        } else {
            System.out.println("Vehicle was not rented.");
        }
    }

}

