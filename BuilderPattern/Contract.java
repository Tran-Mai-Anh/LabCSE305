package BuilderPattern;

public interface Contract {
    public String buildContractID(String contractID);

    public String buildPropertyID(String propertyID);

    public String buildTenantID(String tenantID);

    public int buildRentAmount(int rentAmount);

    public Contract signContract();
}
