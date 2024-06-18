public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    private int index;
    
    // CONSTRUCTOR
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public Item(String name, Double price){
        this.name= name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
   

}
