class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}

class Motorbike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a motorbike...");
    }
}
