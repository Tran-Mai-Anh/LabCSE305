public class Main {
    public static void main(String[] args) {
        // Lấy Factory cho phương tiện đường bộ
        VehicleFactory landFactory = FactoryProducer.getFactory("land");
        Vehicle car = landFactory.createVehicle("car");
        car.drive(); // Output: Driving a car on the road...

        Vehicle motorbike = landFactory.createVehicle("motorbike");
        motorbike.drive(); // Output: Riding a motorbike on the road...

        // Lấy Factory cho phương tiện đường hàng không
        VehicleFactory airFactory = FactoryProducer.getFactory("air");
        Vehicle airplane = airFactory.createVehicle("airplane");
        airplane.drive(); // Output: Flying an airplane in the sky...

        Vehicle helicopter = airFactory.createVehicle("helicopter");
        helicopter.drive(); // Output: Flying a helicopter in the sky...
    }
}
