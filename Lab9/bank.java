// Базовый класс
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнение на " + amount + ". Баланс: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Снятие " + amount + ". Баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}

// Сберегательный счет
class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

// Кредитный счет
class CreditAccount extends BankAccount {

    CreditAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount; // можно уходить в минус
        System.out.println("Кредитное снятие " + amount + ". Баланс: " + balance);
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA123", 1000);
        CreditAccount credit = new CreditAccount("CA456", 500);

        savings.deposit(200);
        savings.withdraw(300);

        credit.withdraw(700);
    }
}