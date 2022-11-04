package samImmanuel;

public class Store {
    private int accountNumber;
    private int balance;
    private int totalCreditApplied;
    private int totalItemsCharged;
    private int creditLimit;


    public Store(int credit){
        totalCreditApplied = credit;
    }
    public Store(int account, int bal, int credit, int items, int limit){
        this(credit);
        accountNumber = account;
        balance = bal;
        totalItemsCharged = items;
        creditLimit = limit;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }
    public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setItemsCharged(int itemsCharged){
        this.totalItemsCharged = itemsCharged;

    }
    public int getItemsCharged(){
        return totalItemsCharged;
    }
    public void setCreditApplied(int creditApplied){
    this.totalCreditApplied = creditApplied;
    }

    public int getCreditApplied(){
        return totalCreditApplied;
    }
    public void setCreditLimit(int creditLimit){
            this.creditLimit = creditLimit;
    }
    public int getCreditLimit(){
        return creditLimit;
    }
    public void calculateNewBalance(){
        balance = getBalance() + totalItemsCharged - creditLimit;
    }
    public boolean isCreditExceeded(){
        if(getBalance() > creditLimit){
            return true;
        }
        return false;
    }
}
