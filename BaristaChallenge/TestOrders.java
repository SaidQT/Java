import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Order order1= new Order();
        Order order2= new Order();
        Order order3= new Order("Saeed");
        Order order4= new Order ("Majed");
        Order order5= new Order ("Ola");
        Item item1= new Item("Drip Coffee", 1.50);
        Item item2= new Item("Cappucino", 3.50);
        Item item3= new Item ("Latte", 7.00);
        Item item4= new Item("Mocha", 3.00);  
        order1.addItems(item1);
        order1.addItems(item3);
        order2.addItems(item4);
        order2.addItems(item2);
        order3.addItems(item1);
        order3.addItems(item3);
        order4.addItems(item1);
        order4.addItems(item4);
        order1.changeOrderStatus(true);
        System.out.println(order1.getStatusMessage());
        order2.changeOrderStatus(false);
        System.out.println(order2.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order1.display();
        order2.display();
        order3.display();
        order4.display();
    }
}
