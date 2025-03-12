public class Main {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport("Sales");
        reportGenerator.generateReport("Inventory");
        reportGenerator.generateReport("Unknown"); 

        ReportFactory.registerReport("custom", () -> () -> System.out.println("Custom Report Generated"));

        reportGenerator.generateReport("custom"); 
    }
}