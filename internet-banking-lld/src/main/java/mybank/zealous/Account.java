package mybank.zealous;

public class Account {
    private long accountNumber;
    private String customer;
    private double accountBalance;
    public Account(long accountNumber, String customer, double accountBalance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.accountBalance = accountBalance;
    }
    public Account() {
    }
    @Override
    public String toString() {
        return "Account {\naccountNumber=" + accountNumber + ",\n customer=" + customer + ",\n accountBalance="
                + accountBalance + "\n}\n";
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
