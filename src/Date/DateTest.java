package Date;

public class DateTest {
    public static void main(String[] args) {
        DateNew birth = new DateNew(7, 23, 1998);
        DateNew hire = new DateNew(6,4,1988);
        Employee employee = new Employee("Badmus", "Alex", birth, hire);

        // employee called implicitly
        System.out.println(employee);

    }
}
