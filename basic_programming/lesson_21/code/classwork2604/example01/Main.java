package classwork2604.example01;

public class Main {

    /*
    Разработать класс для банковского аккаунта
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Illia Tkachov",
                "DE00000000000485484651", AccountType.CREDIT);

        account.deposit(500);
        System.out.println("Deposited 500, amount: " + account.getAmount());

        account.withdraw(400);
        System.out.println("Withdrawn 400, amount: " + account.getAmount());
        System.out.println("In debt: " + account.hasDebt());

        account.withdraw(200);
        System.out.println("Withdrawn 200, amount: " + account.getAmount());
        System.out.println("In debt: " + account.hasDebt());
        /*
        Доп задание: сделать контроллер для банковской системы,
        где можно будет хранить все аккаунты, регистрировать новые аккаунты,
        пересылать деньги с одного аккаунта на другой, и выводить все аккаунты
         */
    }
}
