public class BankAccount {
    private double savingBalance;
    private double checkingBalance;
    private static int numberOfAccounts = 0;

    public BankAccount() {}

    public BankAccount(double savings, double checking) {
        savingBalance = savings;
        checkingBalance = checking;
        numberOfAccounts++;
    }

    public static int bankCount() {
        return numberOfAccounts;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(){
        this.savingBalance = savingBalance;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(){
        this.checkingBalance = checkingBalance;
    }


}


