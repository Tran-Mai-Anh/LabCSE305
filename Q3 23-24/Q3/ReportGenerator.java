public class ReportGenerator {
    public void generateReport(String reportType) {
        try {
            Report report = ReportFactory.getReport(reportType);
            report.generate();
        } catch (IllegalArgumentException e) {
            System.out.println("⚠ Error: " + e.getMessage());
        }
    }
}