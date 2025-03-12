// Interface chung cho tất cả các Builder
interface Builder<T> {
    T build();
}

// Lớp Car
class Car {
    private String engine;
    private int seats;
    private boolean hasGPS;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.hasGPS = builder.hasGPS;
    }

    // Builder cho Car, triển khai từ Builder Interface
    public static class CarBuilder implements Builder<Car> {
        private String engine;
        private int seats;
        private boolean hasGPS;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        @Override
        public Car build() {
            return new Car(this);
        }
    }
}
