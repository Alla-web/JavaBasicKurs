package lesson_24.HomeWork_24.Task2;

public class BankAccount implements PaymentSystem {

    protected double balance;

    //constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    //methods
    @Override
    public double withdrawMoney(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Вы сняли со счёта " + amount + " евро");
        } else {
            System.out.println("Недостаточно средств на счету");
        }
        return balance;
    }

    @Override
    public double depositTransfer(double amount) {
        if (amount > 0 && amount != 0) {
            balance += amount;
            System.out.println("Вы депонировали " + amount + " евро");
        } else {
            System.out.println("Не корректная сумма депозита");
        }
        return balance;
    }

    @Override
    public double checkBalance() {
        System.out.println("Ваш текущий баланс: " + balance + " евро");
        return balance;
    }
}
