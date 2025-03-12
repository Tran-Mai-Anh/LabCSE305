class LandVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorbike")) {
            return new Motorbike();
        }
        return null;
    }
}

class AirVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("airplane")) {
            return new Airplane();
        } else if (type.equalsIgnoreCase("helicopter")) {
            return new Helicopter();
        }
        return null;
    }
}
