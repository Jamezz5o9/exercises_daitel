package samImmanuel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    private Store store;
    private Store racheal;
    private Store banke;

    @BeforeEach
    public void setUp(){
        racheal = new Store(3000);
        store = new Store(4, 4000, 3000, 10000, 15000);
        banke = new Store(4000);
    }

    @Test
    public void calculateBalance(){
       store.setBalance(2000);
       assertEquals(2000, store.getBalance());
    }

    @Test
    public void checkthenewBalance(){
        banke.setAccountNumber(2);
        banke.setBalance(3000);
        banke.setCreditLimit(3000);
        banke.setItemsCharged(3000);


        banke.calculateNewBalance();
        assertEquals(5800, banke.getBalance());

    }

     @Test
    public void newBalanceExceedsExpectedLimit(){
        Store[] newStore = {banke, store, racheal};
        for(int i = 0; i < newStore.length; i++){
            Store newStores = newStore[i];
            newStores.calculateNewBalance();
            if(newStores.isCreditExceeded()){
                System.out.println("Credit limit Exceeded");
            } else {
                System.out.println("You still have spare credit to enjoy");
            }



        }
     }
}
