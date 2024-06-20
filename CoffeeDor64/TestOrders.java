import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Order order1= new Order();
        // Order order2= new Order();
        // Order order3= new Order("Saeed");
        // Order order4= new Order ("Majed");
        // Order order5= new Order ("Ola");
        // Item item1= new Item("Drip Coffee", 1.50);
        // System.out.println(item1.getIndex());
        
        // Item item2= new Item("Cappucino", 3.50);
        // System.out.println(item2.getIndex());
        // Item item3= new Item ("Latte", 7.00);
        // Item item4= new Item("Mocha", 3.00);  
        // order1.addItems(item1);
        // order1.addItems(item3);
        // order2.addItems(item4);
        // order2.addItems(item2);
        // order3.addItems(item1);
        // order3.addItems(item3);
        // order4.addItems(item1);
        // order4.addItems(item4);
        // order1.changeOrderStatus(true);
        // System.out.println(order1.getStatusMessage());
        // order2.changeOrderStatus(false);
        // System.out.println(order2.getStatusMessage());
        // System.out.println(order1.getOrderTotal());
        // order1.display();
        // order2.display();
        // order3.display();
        // order4.display();
        // CoffeeKiosk coffee1= new CoffeeKiosk();
        // System.out.println(coffee1.getMenu());
        // coffee1.addMenuItem(item1);
        // coffee1.addMenuItem(item2);
        // coffee1.displayMenu();
        CoffeeKiosk coffee1= new CoffeeKiosk();
        coffee1.addMenuItem("mocha", 3.50);
        coffee1.addMenuItem("cappucino", 5.50);
        coffee1.newOrder();
      
    }
}
