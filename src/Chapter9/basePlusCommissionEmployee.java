package Chapter9;

public class basePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public basePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary ){
    super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary shouldn't be <= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary should be less than <= 0.0");
        }
    }
    public double getBaseSalary(){
        return baseSalary;
    }
}
