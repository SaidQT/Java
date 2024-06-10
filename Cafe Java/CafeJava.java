public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = "Your order will be ready shortly";
        String readyMessage = "Your order is ready";
        String displayTotalMessage = "Your total is $";
    
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4.5;
        double cappuccino = 3.99;
        double latte = 5.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1){
            System.out.println(readyMessage + customer1);
        } 
        else{
            System.out.println(pendingMessage);
        }
        if (isReadyOrder4){
            System.out.println(readyMessage + " " + customer4);
            System.out.println(displayTotalMessage + "" + cappuccino);
        }
        else{
            System.out.println(pendingMessage + " "+ customer4);
        }
        if(isReadyOrder2){
            System.out.println(readyMessage+ " " + customer2 );
            System.out.println(displayTotalMessage + " " + latte*2);
        }
        else{
            System.out.println(pendingMessage + " " + customer2);
        }
        if (isReadyOrder3){
            System.out.println(readyMessage + " " + customer3 );
            System.out.println(displayTotalMessage + " " + dripCoffee);
            if (latte > dripCoffee){
            System.out.printf("You ordered latte, the difference is $%.2f%n", (latte - dripCoffee));
            }
            else{
                System.out.printf("You ordered latte, the difference is $%.2f%n", (dripCoffee-latte));

            }
        }
        else{
            System.out.println(pendingMessage + " " + customer3);
        }
    }
}
