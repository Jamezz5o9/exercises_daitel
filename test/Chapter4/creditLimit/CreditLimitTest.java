package Chapter4.creditLimit;

import Chapter4.creditLimit.StoreCustomer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitTest {
    private StoreCustomer joshua;
    private StoreCustomer bolaji;

    @BeforeEach
    public void setUp(){
    joshua = new StoreCustomer(1, 5000, 7000, 10000, 5000);
    bolaji = new StoreCustomer(2, 7000, 15000, 1500, 3000);
    }

    @Test
    public void checkThatStoreCustomerExist(){
        assertNotNull(joshua);
    }

    @Test
     public void checkForCreditBalance(){
        joshua.creditBalance();
        assertEquals(2000, joshua.getBalance());
    }
    @Test
    public void checkIfCreditLimitHasBeenExceededByStoreCustomer(){
        joshua.creditBalance();
        assertFalse(joshua.creditLimitExceeded());
    }

    @Test
    public void calculateForNegativeBalance(){
        joshua.setBalance(-1000);
        joshua.creditBalance();
        assertEquals(0, joshua.getBalance());
    }
    @Test
    public void checkCreditLimitExceededWithHighItemCharged(){
        joshua.setItemsCharged(15000);
        joshua.creditBalance();
        assertTrue(joshua.creditLimitExceeded());
    }
    @Test
    public void main(){
        StoreCustomer[] customers = {joshua, bolaji};
        for(int i = 0; i < customers.length; i++){
            StoreCustomer customer = customers[i];
            if(customers[i].creditLimitExceeded()){
                System.out.println("Credit Limit exceeded");
            }else{
                System.out.println("Credit Limit not exceeded");
            }
        }
    }




}
