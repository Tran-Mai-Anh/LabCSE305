package BuilderPattern;

public class ShortTerm implements Contract {
    private String contractID;
    private int rentAmount;
    private String tenantID;
    private String propertyID;

    public ShortTerm(String contractID, String propertyID, int rentAmount, String tenantID) {
        this.contractID = contractID;
        this.rentAmount = rentAmount;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
    }

    public ShortTerm() {

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
        Contract shortTermContract = new ShortTerm(this.contractID, this.propertyID, this.rentAmount, this.tenantID);
        return shortTermContract;
    }

    @Override
    public String toString() {
        return "ShortTermContract{" +
                "contractID=" + contractID +
                ", propertyID=" + propertyID +
                ", tenantID=" + tenantID +
                ", rentAmount=" + rentAmount +
                '}';
    }

    @Override
    public String getContractType() {
        return "ShortTerm";
    }
}
