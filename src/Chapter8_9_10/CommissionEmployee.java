package Chapter8_9_10;

public class CommissionEmployee {
    private String firstName;
    private String socialSecurityNumber;
    private String lastName;
    private double grossSales;
    private double commissionRate;
    private BaseCommissionEmployee baseCommissionEmployee;

    public CommissionEmployee(String firstName, String socialSecurityNumber, String lastName, double grossSales, double commissionRate, BaseCommissionEmployee baseCommissionEmployee) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales can't be < 0.0");
        }
        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate can't be < 0.0 and must'nt be > 1.0");
        }
        this.firstName = firstName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.lastName = lastName;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseCommissionEmployee = baseCommissionEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrossSales() {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales can't be < 0.0");
        }
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission rate can't be < 0.0 and mustn't be > 1.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public BaseCommissionEmployee getBaseCommissionEmployee() {
        return baseCommissionEmployee;
    }

    public void setBaseCommissionEmployee(BaseCommissionEmployee baseCommissionEmployee) {
        this.baseCommissionEmployee = baseCommissionEmployee;
    }

    public double commissionEmployeeEarnings(){
        return getCommissionRate()  * getGrossSales();
    }
    public double baseComEmployeeEarnings(){
        return  commissionEmployeeEarnings() + baseCommissionEmployee.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n, %s: %s%n%s: %.2f%n, %s: %.2f%n",
                "Commission employee", getFirstName(), getLastName(),
                "Social Security number", getSocialSecurityNumber(),
                "Gross sales", getGrossSales(),
                "Commission rate", getCommissionRate());
    }
}
