public class ReportGenerator {
    public void generateReport(String reportType) {
        Report report = ReportFactory.createReport(reportType);
        report.generate();
    }

    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport("Sales");
        generator.generateReport("Inventory");
    }
}