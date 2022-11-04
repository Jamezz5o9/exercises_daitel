package Chapter4.creditLimit;

public class StoreCustomer {
    private int accountNumber;
    private int balance;
    private int itemsCharged;
    private int creditsApplied;
    private int creditLimits;
    public StoreCustomer(){};
    public StoreCustomer(int accountNumber){};
    public StoreCustomer(int accountNumber, int balance, int itemsCharged, int creditsApplied, int creditLimits) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.itemsCharged = itemsCharged;
        this.creditsApplied = creditsApplied;
        this.creditLimits = creditLimits;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getItemsCharged() {
        return itemsCharged;
    }

    public void setItemsCharged(int itemsCharged) {
        this.itemsCharged = itemsCharged;
    }

    public int getCreditsApplied() {
        return creditsApplied;
    }

    public void setCreditsApplied(int creditsApplied) {
        this.creditsApplied = creditsApplied;
    }

    public int getCreditLimits() {
        return creditLimits;
    }

    public void setCreditLimits(int creditLimits) {
        this.creditLimits = creditLimits;
    }

    public void creditBalance() {
        if(getBalance() > 0){
            balance = getBalance() + getItemsCharged()  - getCreditsApplied();
            setBalance(balance);
        } else{
            setBalance(0);
        }
    }

    public boolean creditLimitExceeded() {
        return getBalance() > getCreditLimits();
    }
}
