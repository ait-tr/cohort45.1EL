package classwork0305.example02;

public class Main {
    public static void main(String[] args) {
        Human anton = new Human("Anton", "Gamburg, Germany", 35);
        CreditBankAccount account =
                new CreditBankAccount(123, "DE0000000968546515", anton, 1000);
        account.deposit(1500);
        System.out.println("Amount: " + account.getAmount());
        account.takeLoan(500);
        System.out.println("Amount: " + account.getAmount());
        System.out.println("Current debt: " + account.getCurrentDebt());
        account.takeLoan(1000);
        System.out.println("Amount: " + account.getAmount());
        System.out.println("Current debt: " + account.getCurrentDebt());
        // BankAccount account = new CreditBankAccount(...)
    }
}
