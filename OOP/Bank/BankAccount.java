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

    public void depositSaving(int amount) {
        System.out.println("You deposited $" + amount + " into your savings account");
        this.savingBalance += amount;
    }

    public void depositChecking(int amount) {
        System.out.println("You deposited $" + amount + " into your checking account");
        this.checkingBalance += amount;
    }
    public void withdrawSaving(int amount) {
        if (savingBalance < amount){
            System.out.println("You attempted to withdraw $" + amount + " from your savings account. Insufficient Funds. Unable to complete Transaction");
        }else{
            System.out.println("You withdrew $" + amount + " from your savings account");
            this.savingBalance -= amount;
        }
    }

    public void withdrawChecking(int amount) {
        if (savingBalance < amount){
            System.out.println("You attempted to withdraw $" + amount + " from your checking account. Insufficient Funds. Unable to complete Transaction");
        }else{
            System.out.println("You withdrew $" + amount + " from your checking account");
            this.checkingBalance -= amount;
        }
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


