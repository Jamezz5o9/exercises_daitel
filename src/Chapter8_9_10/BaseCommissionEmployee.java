package Chapter8_9_10;

public class BaseCommissionEmployee {
    private double baseSalary;

    public BaseCommissionEmployee(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary shouldn't be < 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary shouldn't be < 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double earnings(){
        return getBaseSalary();
    }
}
