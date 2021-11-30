public class CafeUtil{
    public Integer getStreakGoal(){
        int sum = 0;
        for(int i=1;i<=10;i++) {
            sum = sum + i;
        }
        return sum;
    }
    public double getOrderTotal(double[] total){
        double sum = 0;
        
        for(double price: total){
            sum+=price;
        }
        return sum;
    }
    // public String displayMenu() {
    //     for (String item: menu) {
    //         System.out.println(item);
    //     }
    // }

}