import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
    public CoffeeKiosk(){
        this.menu= new ArrayList<Item>();
        this.orders=new ArrayList<Order>();
    }
    public ArrayList<Item> getMenu() {
        return menu;
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }
    public void addMenuItem(String name, Double price){
        Item newItem= new Item(name, price);
        this.menu.add(newItem);
        newItem.setIndex(this.menu.indexOf(newItem));
    }
    public void displayMenu(){
        for(int item=0; item<this.menu.size();item++){
            System.out.println(this.menu.get(item).getIndex()+ " " + this.menu.get(item).getName()+ " -- $"+ this.menu.get(item).getPrice());
        }
        }
    public void newOrder() {
            
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        
           
        Order newOrder= new Order(name);
        displayMenu();
            
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        try{
        newOrder.addItems(this.menu.get(Integer.parseInt(itemNumber)));
        while(!itemNumber.equals("q")) {
        System.out.println("Please enter another menu item index or q to quit:");
        itemNumber = System.console().readLine();
        newOrder.addItems(this.menu.get(Integer.parseInt(itemNumber)));
        
            }
            }
        catch(Exception e){
            System.out.println("This index in not in the menu displayed, please try again");
            while(!itemNumber.equals("q")) {
                System.out.println("Please enter another menu item index or q to quit:");
                itemNumber = System.console().readLine();
                newOrder.addItems(this.menu.get(Integer.parseInt(itemNumber)));
        }
        newOrder.display();// After you have collected their order, print the order details 
    
        }
    
    
    }
    public void addMenuItemByInput(){
        
        System.out.println("Please enter item name:");
        String name=System.console().readLine();
        System.out.println("Enter the price for the item:");
        String input= System.console().readLine();
        Double price = Double.parseDouble(input);
        
        Item newItem= new Item(name,price);
        this.menu.add(newItem);
        newItem.setIndex(this.menu.indexOf(newItem));
        displayMenu();
    }
}




