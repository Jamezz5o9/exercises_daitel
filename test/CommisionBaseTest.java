import Chapter8_9_10.BaseCommissionEmployee;
import Chapter8_9_10.CommissionEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommisionBaseTest {
    private CommissionEmployee commissionEmployee;

    @BeforeEach
    void setUp(){
        commissionEmployee = new CommissionEmployee("James", "111-222", "Adeniyi", 400, .5, new BaseCommissionEmployee(200));
    }

    @Test
    public void calculateCommissionEmployeeEarnings(){
        assertEquals(200, commissionEmployee.commissionEmployeeEarnings());
    }
    @Test
    public void calculateBaseCommissionEmployeeEarnings(){
        assertEquals(400, commissionEmployee.baseComEmployeeEarnings());
    }
}
