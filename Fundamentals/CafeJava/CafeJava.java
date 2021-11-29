public class CafeJava {
    public static void main (String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripPrice = 1.25;
        double lattePrice = 4.25;
        double cappuccinoPrice = 3.25;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        System.out.println("---------------");

        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage);
        System.out.println(displayTotalMessage + dripPrice);

        System.out.println("---------------");

        if (isReadyOrder2){
            System.out.println(generalGreeting + customer4);
            System.out.println( customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println("---------------");
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + lattePrice*2);
        if (isReadyOrder3){
            System.out.println(customer2 + readyMessage);
        }else{
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println("---------------");

        System.out.println(displayTotalMessage + (dripPrice-lattePrice));
    }
}