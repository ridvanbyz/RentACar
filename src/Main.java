public class Main {
    public static void main(String[] args) {
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem();

        Car car = new Car(1, "Toyota", "Supra",120,  2);
        Bike bike = new Bike(2, "Arora", " Casper", 25, true);

        rentalSystem.rentVehicle(car);
        rentalSystem.rentVehicle(bike);
        rentalSystem.addRental(new Vehicle(3,"Mercedes","Maybach",150));


    }
}
