public class Product{
    private int id;
    private String name;
    private int quantity;
    private double price;
    private static int ProductCount;
    static{
        ProductCount = 0 ;
    }
    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price ;
        ProductCount++;
    }
    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price ;
    }
    public void setQuantity(int qty){
        this.quantity = qty ;
    }
    public void display(){
        System.out.println("Product ID: "+id);
        System.out.println("Product Name: "+name);
        System.out.println("Product Quantity: "+quantity);
        System.out.println("Product Price: "+price);
        System.out.println();
    }
    public void displayproductCount(){
        System.out.println("Total Product Count: "+ProductCount);
    }
}