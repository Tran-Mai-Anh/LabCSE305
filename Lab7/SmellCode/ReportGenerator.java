import java.text.*;
import java.util.*;

class OwnerInfo {
    private final String ownerName;
    private final String location;

    public OwnerInfo(String ownerName, String location) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be null or empty.");
        }
        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Location cannot be null or empty.");
        }
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Owner: " + ownerName + ", Location: " + location;
    }
}

class Property {
    private final String name;
    private final double rentAmount;
    private final OwnerInfo ownerInfo;
    private static final DecimalFormat formatter = new DecimalFormat("#,###.00");

    public Property(String name, double rentAmount, OwnerInfo ownerInfo) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Property name cannot be null or empty.");
        }
        if (rentAmount <= 0) {
            throw new IllegalArgumentException("Rent amount must be positive.");
        }
        if (ownerInfo == null) {
            throw new IllegalArgumentException("Owner information cannot be null.");
        }
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerInfo = ownerInfo;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public boolean isPremiumProperty() {
        return rentAmount > 2000;
    }

    public String calculateYearlyRent() {
        return formatter.format(rentAmount * 12);
    }

    public void printPropertyDetails() {
        System.out.println("Property: " + name);
        System.out.println("Rent Amount: $" + formatter.format(rentAmount));
        System.out.println(ownerInfo);
    }
}

class FinancialReport {
    private final String reportTitle;
    private final List<Property> properties;
    private double totalRent;
    private static final DecimalFormat formatter = new DecimalFormat("#,###.00");

    public FinancialReport(String reportTitle, List<Property> properties) {
        if (reportTitle == null || reportTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Report title cannot be null or empty.");
        }
        if (properties == null || properties.isEmpty()) {
            throw new IllegalArgumentException("Property list cannot be null or empty.");
        }
        this.reportTitle = reportTitle;
        this.properties = Collections.unmodifiableList(properties);  
    }

    public void generateReport() {
        totalRent = 0;
        printHeader();
        for (Property property : properties) {
            printPropertyDetails(property);
            totalRent += property.getRentAmount();
        }
        printFooter();
    }

    private void printHeader() {
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
    }

    private void printPropertyDetails(Property property) {
        property.printPropertyDetails();
        System.out.println(property.isPremiumProperty() ? "This is a premium property." : "This is a standard property.");
        System.out.println("Yearly Rent: $" + property.calculateYearlyRent());
        System.out.println("--------------------");
    }

    private void printFooter() {
        System.out.println("Total Rent Amount: $" + formatter.format(totalRent));
    }
}

public class ReportGenerator {
    public static void main(String[] args) {
        try {
            OwnerInfo owner1 = new OwnerInfo("John Doe", "City Center");
            OwnerInfo owner2 = new OwnerInfo("Jane Smith", "Suburb");
            OwnerInfo owner3 = new OwnerInfo("Bob Johnson", "Downtown");

            Property property1 = new Property("Apartment A", 1500.0, owner1);
            Property property2 = new Property("House B", 2000.0, owner2);
            Property property3 = new Property("Condo C", 1800.0, owner3);

            FinancialReport financialReport = new FinancialReport("Monthly Rent Summary", List.of(property1, property2, property3));
            financialReport.generateReport();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
