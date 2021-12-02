public class BankTest {
    public static void main (String[] args) {
        BankAccount bankAccount1 = new BankAccount(50, 100);
        BankAccount bankAccount2 = new BankAccount(75, 150);
        BankAccount bankAccount3 = new BankAccount(100, 200);
        System.out.println(BankAccount.bankCount() + " accounts have been opened.");

        System.out.println(bankAccount1.getSavingBalance());
        System.out.println(bankAccount1.getCheckingBalance());
        System.out.println(bankAccount2.getSavingBalance());
        System.out.println(bankAccount2.getCheckingBalance());
        System.out.println(bankAccount3.getSavingBalance());
        System.out.println(bankAccount3.getCheckingBalance());
    }
}