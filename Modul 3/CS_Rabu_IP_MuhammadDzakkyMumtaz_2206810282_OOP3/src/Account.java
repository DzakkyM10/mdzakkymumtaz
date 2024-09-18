public class Account {
    private int accountNumber;
    private  double balance;
    private Bank bank;
    private AccountType accounType;

    public Account{
        int accountNumber;
        double balance;
        Bank bank;
        AccountType accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccounType() {
        return accounType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
