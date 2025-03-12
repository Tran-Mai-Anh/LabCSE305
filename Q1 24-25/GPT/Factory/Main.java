public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive(); // Output: Driving a car...

        Vehicle motorbike = VehicleFactory.getVehicle("motorbike");
        motorbike.drive(); // Output: Riding a motorbike...
    }
}
