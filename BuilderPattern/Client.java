package BuilderPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contractID = sc.nextLine();
        int rentAmount = sc.nextInt();
        sc.nextLine();
        String tenantID =sc.nextLine();
        String propertyID=sc.nextLine();
        Contract contract=new ShortTerm(contractID, propertyID, rentAmount, tenantID).signContract();
        System.out.println(contract);
    }
}