class FactoryProducer {
    public static VehicleFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("land")) {
            return new LandVehicleFactory();
        } else if (factoryType.equalsIgnoreCase("air")) {
            return new AirVehicleFactory();
        }
        return null;
    }
}
