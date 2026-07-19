package banksystem;

public class BankSystem {

    public static void main(String[] args) {
        Bank_Account account = new Bank_Account("123456", "Hadi", 1000);

        account.displayInfo();

        account.deposit(500);

        account.withdraw(300);

        System.out.println("Current Balance: " + account.getBalance());
    }
}


