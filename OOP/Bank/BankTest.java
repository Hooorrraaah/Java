public class BankTest {
    public static void main (String[] args) {
        BankAccount bankAccount1 = new BankAccount(50, 100);
        BankAccount bankAccount2 = new BankAccount(75, 150);
        BankAccount bankAccount3 = new BankAccount(100, 200);
        System.out.println(BankAccount.bankCount() + " accounts have been opened.");

        System.out.println("Saving's Account: $" + bankAccount1.getSavingBalance()+ " Checking Account: $" + bankAccount1.getCheckingBalance());
        System.out.println("Saving's Account: $" + bankAccount2.getSavingBalance()+ " Checking Account: $" + bankAccount2.getCheckingBalance());
        System.out.println("Saving's Account: $" + bankAccount3.getSavingBalance()+ " Checking Account: $" + bankAccount3.getCheckingBalance());

        bankAccount1.depositSaving(50);
        bankAccount1.withdrawSaving(50);
        bankAccount1.withdrawSaving(500);
        bankAccount1.withdrawChecking(50);
        bankAccount1.withdrawChecking(500);
        System.out.println("Saving's Account: $" + bankAccount1.getSavingBalance()+ " Checking Account: $" + bankAccount1.getCheckingBalance());


    }
}