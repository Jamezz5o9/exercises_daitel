package Chapter9;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);

        System.out.println("Employee information obtained by get method");
        System.out.printf("%s %s%n", "First Name is ", employee.getFirstName());
        System.out.printf("%s %s%n", "Last Name is", employee.getLastName());
        System.out.printf("%s %s%n", "Security Number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());

        employee.setGrossSales(5000);
        employee.setCommissionRate(.2);

        System.out.printf("%n%s:%n%n%s%n", "Updated information of employee obtained by toString", employee);

    }
}
