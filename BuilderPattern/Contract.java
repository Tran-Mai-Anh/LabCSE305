package BuilderPattern;

import java.io.*;
import java.util.*;

interface Contract {
    String buildContractID(String contractID);
    String buildPropertyID(String propertyID);
    String buildTenantID(String tenantID);
    int buildRentAmount(int rentAmount);
    Contract signContract();
    String getContractType();
}
 

