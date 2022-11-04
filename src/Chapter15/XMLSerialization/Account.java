package Chapter15.XMLSerialization;

import java.util.ArrayList;
import java.util.List;
//import javax.xml.bind.annotation.XmlElement;

public class Account {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;

    //@XmlElement(name="account")
    private List<Account> accounts = new ArrayList<>();

    public Account(){
        this(0, "", "", 0.00);
    }

    public Account(int accountNumber, String firstName, String lastName, double balance) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public List<Account> getAccounts(){
        return accounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
