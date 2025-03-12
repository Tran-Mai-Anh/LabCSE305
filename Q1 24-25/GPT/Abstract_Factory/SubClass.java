class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car on the road...");
    }
}

class Motorbike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a motorbike on the road...");
    }
}

class Airplane implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Flying an airplane in the sky...");
    }
}

class Helicopter implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Flying a helicopter in the sky...");
    }
}
