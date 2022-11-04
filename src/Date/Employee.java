package Date;

public class Employee {
    private String firstName;
    private String lastName;
    private DateNew birthDate;
    private DateNew hireDate;

    public Employee(String first, String last, DateNew birth, DateNew hire){
        this.firstName = first;;
        this.lastName = last;
        this.birthDate = birth;
        this.hireDate = hire;
    }

    public String toString(){
       return String.format("%s %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
