package Q4;

public class Main {
    public static void main(String[] args) {
        ConcreteBicycleBuilder b = new ConcreteBicycleBuilder();
        Bicycle d = b.addFrameSize("Large")
                .addWheelType("Mountain Wheels")
                .addGearSystem("Shimano 21-Speed")
                .addAccessory("Water Bottle Holder")
                .addAccessory("LED Lights")
                .build();

        d.printInfo();
        // System.out.println(d.toString());
    }
}