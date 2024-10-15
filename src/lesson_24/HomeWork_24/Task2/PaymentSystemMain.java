package lesson_24.HomeWork_24.Task2;

public class PaymentSystemMain {
    public static void main(String[] args) {

        System.out.println("----------------------BankAccount----------------------");
        BankAccount bank = new BankAccount(1000);
        bank.withdrawMoney(500.5);
        bank.depositTransfer(1000);
        bank.checkBalance();

        System.out.println("----------------------ElectronicWallet----------------------");
        ElectronicWallet electronicWallet = new ElectronicWallet(2000);
        electronicWallet.withdrawMoney(150.55);
        electronicWallet.depositTransfer(550.99);
        electronicWallet.checkBalance();
    }
}
