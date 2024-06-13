import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
 
    // MEMBER VARIABLES
    private String name="" ; 
    private boolean ready; 
    private ArrayList<Item> items ; 
    private Double total=0.0;
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name="Guest";
        this.items= new ArrayList<Item>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name= name;
        this.items= new ArrayList<Item>();
    }
    
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    public String getOrderName(){
        return name;
    }
    public void setOrderName(String name){
        this.name= name;
    }
    public boolean getStatusMessage(){
        return ready;
    }
    public void changeOrderStatus(Boolean ready){
        this.ready= ready;
    }
    public ArrayList<Item> getItems(){
        return items;
    }
    public void addItems(Item item){
        items.add(item);
        total += item.getPrice();
    }
    public Double getOrderTotal(){
        return total;
    }
    public void display(){
        System.out.println("Name:" + " " +name);
        for (int i =0; i <items.size(); i++){
            System.out.println(items.get(i).getName()+ " - $" + items.get(i).getPrice() );
        }
        System.out.println("Total:" + " $" + total);
    }
    
}

