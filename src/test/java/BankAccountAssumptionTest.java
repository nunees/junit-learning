import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;

public class BankAccountAssumptionTest {
    @Test
    @DisplayName("Test Activation account after creation")
    public void testWithDraw(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        assumeTrue(bankAccount == null, "Account is null");
    }
}
