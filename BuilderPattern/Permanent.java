package BuilderPattern;

public class Permanent {
    private String contractID;
    private int rentAmount;
    private String tenantID;
    private String propertyID;

    public Permanent(String contractID, String propertyID, int rentAmount, String tenantID) {
        this.contractID = contractID;
        this.rentAmount = rentAmount;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
    }

    public Permanent() {

    }

    public String buildContractID(String contractID) {
        this.contractID = contractID;
        return contractID;
    }

    public int buildRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
        return rentAmount;
    }

    public String buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return tenantID;
    }

    public String buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return propertyID;
    }

    public Contract signContract() {
        Contract longTermContract = new LongTerm(this.contractID, this.propertyID, this.tenantID, this.rentAmount);
        return longTermContract;
    }

}
