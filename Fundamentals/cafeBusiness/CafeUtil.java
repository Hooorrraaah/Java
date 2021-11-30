import java.util.ArrayList;

public class CafeUtil{
    public Integer getStreakGoal(){
        int sum = 0;
        for(int i=1;i<=10;i++) {
            sum = sum + i;
        }
        return sum;
    }
    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        
        for(double price: lineItems){
            sum+=price;
        }
        return sum;
    }
    public void displayMenu(String[] menu) {
        for (String item: menu) {
            System.out.println(item);
        }
    }
    public ArrayList<String> addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        return
    }
}