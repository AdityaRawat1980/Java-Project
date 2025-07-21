import java.util.*;
public class Inventory {
    private ArrayList <Product> Products = new ArrayList<>();
    public void addProduct(Product P){
        Products.add(P);
        System.out.println("you add the product sucessfully");
    }
    public void removeProduct(int id){
        Products.removeIf(P ->P.getId() == id);
        System.out.println("you removed the product sucessfully");
    }
    public void updateStock(int id, int quantity){
        for(Product P : Products){
            if(P.getId() == id){
                P.setQuantity(quantity);
                System.out.println("You updated the stock sucesfully");
                return;
            }
        }
        System.out.println("Product not found in product ");
    }
    public void showProduct(){
        for(Product P : Products){
            P.display();
        }
    }
}
