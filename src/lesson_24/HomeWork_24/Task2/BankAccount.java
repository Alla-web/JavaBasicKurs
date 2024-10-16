package lesson_24.HomeWork_24.Task2;

public class BankAccount implements PaymentSystem {

    protected double balance;
    protected String currency;

    //constructor
    public BankAccount(double balance) {
        this.balance = balance;
        this.currency = "EUR";
    }

    //getters
    public double getBalance() {
        return balance;
    }

    //setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //methods
    @Override
    public double withdrawMoney(double amount) {
        if (amount < balance || amount > 0) {
            balance -= amount;
            System.out.println("Вы сняли со счёта " + amount + " " + currency);
        } else {
            System.out.println("Недостаточно средств на счету");
        }
        return balance;
    }

    @Override
    public double depositTransfer(double amount) {
        if (amount > 0 && amount != 0) {
            balance += amount;
            System.out.println("Вы депонировали " + amount + " " + currency);
        } else {
            System.out.println("Не корректная сумма депозита");
        }
        return balance;
    }

    @Override
    public double checkBalance() {
        System.out.println("Ваш текущий баланс: " + balance + " " + currency);
        return balance;
    }
}
