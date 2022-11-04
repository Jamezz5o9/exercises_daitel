package Chapter10.Employee;

public class PayRollTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("James", "Adeniyi", "222-444-55",5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Amez", "Adeniyi",  "444-897", 200, 41);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Ade", "Olagoke", "333-889", 0.2, 3000);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Favour", "Aduloju","333-980",0.6, 2000, 400);
        System.out.println("Employees processed individually: ");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());


        Employee[] employee = new Employee[4];

        employee[0] = salariedEmployee;
        employee[1] = hourlyEmployee;
        employee[2] = commissionEmployee;
        employee[3] = basePlusCommissionEmployee;

        for(Employee employees: employee){
            System.out.printf("%s%n",employees);


            if(employees instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee curEmployee = (BasePlusCommissionEmployee) employees;

                curEmployee.setBaseSalary(1.10 * curEmployee.getBaseSalary());

                System.out.printf("%s: $%,.2f%n", "new base salary with 10% increase is", curEmployee.getBaseSalary());

            }
            System.out.printf(
                    "earned $%,.2f%n%n", employees.earnings());
        }

        for(int j = 0; j < employee.length; j++){
            System.out.printf("Employee %d is a %s%n", j,
                    employee[j].getClass().getName());
        }
    }
}
