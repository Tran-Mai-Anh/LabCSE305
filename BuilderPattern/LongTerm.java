package BuilderPattern;

public class LongTerm implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    public LongTerm(String contractID, String propertyID, String tenantID, int rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public LongTerm() {

    }

    public String buildContractID(String contractID) {
        this.contractID = contractID;
        return contractID;
    }

    public String buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return propertyID;
    }

    public String buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return tenantID;
    }

    public int buildRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
        return rentAmount;
    }

    public Contract signContract() {
        Contract longTermContract = new LongTerm(this.contractID, this.propertyID, this.tenantID, this.rentAmount);
        return longTermContract;
    }

    @Override
    public String toString() {
        return "LongTermContract{" +
                "contractID=" + contractID +
                ", propertyID=" + propertyID +
                ", tenantID=" + tenantID +
                ", rentAmount=" + rentAmount +
                '}';
    }

    @Override
    public String getContractType() {
        return "LongTerm";
    }
}
