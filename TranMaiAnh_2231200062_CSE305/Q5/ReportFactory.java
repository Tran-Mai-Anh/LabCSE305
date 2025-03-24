public class ReportFactory {
    public static Report createReport(String reportType) {
        switch (reportType) {
            case "Sales":
                return new SalesReport();
            case "Inventory":
                return new InventoryReport();
            default:
                throw new IllegalArgumentException("Error");
        }
    }
}