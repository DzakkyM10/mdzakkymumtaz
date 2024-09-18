public class ConventionalAccount extends Account {
    private double credit;
    private double creditInterestRate;

    public ConventionalAccount {
        int accountNumber;
        double balance;
        Bank bank;
        AccountType accountType;
        double creditInterestRate;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }
}
