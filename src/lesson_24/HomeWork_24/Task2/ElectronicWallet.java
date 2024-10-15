package lesson_24.HomeWork_24.Task2;

public class ElectronicWallet extends BankAccount implements PaymentSystem {

    //constructor
    public ElectronicWallet(double balance) {
        super(balance);
    }

    //methods
    @Override
    public double withdrawMoney(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Вы сняли со счёта " + amount + " Bitcoins");
        } else {
            System.out.println("Недостаточно средств на счету");
        }
        return balance;
    }

    @Override
    public double depositTransfer(double amount) {
        if (amount > 0 && amount != 0) {
            balance += amount;
            System.out.println("Вы депонировали " + amount + " Bitcoins");
        } else {
            System.out.println("Не корректная сумма депозита");
        }
        return balance;
    }

    @Override
    public double checkBalance() {
        System.out.println("Ваш текущий баланс: " + balance + " Bitcoins");
        return balance;
    }
}
