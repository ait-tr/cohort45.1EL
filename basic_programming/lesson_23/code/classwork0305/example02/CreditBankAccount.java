package classwork0305.example02;

public class CreditBankAccount extends BankAccount {
    private double creditLimit;
    private double currentDebt;

    public CreditBankAccount(int id, String iban, Human owner, double creditLimit) {
        super(id, iban, owner);
        this.creditLimit = creditLimit;
        currentDebt = 0;
    }

    public void takeLoan(double amount) {
        if (amount >= creditLimit - currentDebt) {
            return;
        }
        currentDebt += amount;
        this.amount += amount;
    }

    public void repay(double amount) {
        double diff = amount - currentDebt;
        if (diff > 0) {
            currentDebt = 0;
            this.amount += diff;
        } else {
            currentDebt -= amount;
        }
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCurrentDebt() {
        return currentDebt;
    }
}
