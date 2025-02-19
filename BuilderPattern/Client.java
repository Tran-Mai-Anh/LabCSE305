package BuilderPattern;

import java.io.*;
import java.util.*;

public class Client {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Contract Type (Permanent, LongTerm, ShortTerm): ");
        String contractType = sc.nextLine();

        Contract contract = requestCreateRentalContract(contractType);
        System.out.println("\nRental contract created successfully!");
        System.out.println(contract.toString());

        saveContractToFile(contract);
    }

    public static Contract requestCreateRentalContract(String contractType) {
        Contract contract = null;

        switch (contractType.toLowerCase()) {
            case "permanent":
                contract = new Permanent();
                break;
            case "longterm":
                contract = new LongTerm();
                break;
            case "shortterm":
                contract = new ShortTerm();
                break;
            default:
                throw new IllegalArgumentException("Invalid contract type.");
        }

        System.out.print("Enter Contract ID: ");
        String contractID = sc.nextLine();

        System.out.print("Enter Property ID: ");
        String propertyID = sc.nextLine();

        System.out.print("Enter Tenant ID: ");
        String tenantID = sc.nextLine();

        System.out.print("Enter Rent Amount: ");
        int rentAmount = sc.nextInt();
        sc.nextLine();

        contract.buildContractID(contractID);
        contract.buildPropertyID(propertyID);
        contract.buildTenantID(tenantID);
        contract.buildRentAmount(rentAmount);
        return contract.signContract();
    }

    public static void saveContractToFile(Contract contract) {
        try {
            File directory = new File("contracts");
            if (!directory.exists()) {
                directory.mkdir(); 
            }

            String fileName = "contracts/" + contract.getContractType() + "_Contract.txt";
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(contract.toString() + "\n");
            writer.close();

            System.out.println("Contract saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving contract to file: " + e.getMessage());
        }
    }
}