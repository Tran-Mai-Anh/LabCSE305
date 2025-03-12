import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ReportFactory {
    private static final Map<String, ReportFactoryInterface> reportMap = new ConcurrentHashMap<>();

    static {
        registerReport("sales", SalesReport::new);
        registerReport("inventory", InventoryReport::new);
    }

    public static void registerReport(String reportType, ReportFactoryInterface factory) {
        if (reportType == null || reportType.trim().isEmpty()) {
            throw new IllegalArgumentException("Report type cannot be null or empty.");
        }
        reportMap.putIfAbsent(reportType.toLowerCase(), factory);
    }

    public static Report getReport(String reportType) {
        return Optional.ofNullable(reportMap.get(reportType.toLowerCase()))
                .orElseThrow(() -> new IllegalArgumentException("Error: Invalid report type"))
                .createReport();
    }
}