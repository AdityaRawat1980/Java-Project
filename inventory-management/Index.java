import java.util.*;

public class Index {
    static Scanner sc = new Scanner(System.in);
    static Inventory inventory = new Inventory();
    static User user = new User();

    public static void main(String[] args) {
        System.out.println("=== Welcome to Inventory Management System ===");

        while (true) {
            System.out.println("\n1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    signUp();
                    break;
                case 2:
                    if (login()) {
                        inventoryMenu();
                    } else {
                        System.out.println("Invalid credentials. Try again.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public static void signUp() {
        System.out.print("Enter new username: ");
        String u = sc.nextLine();
        System.out.print("Enter new password: ");
        String p = sc.nextLine();

        user.Sign_up(u, p);
        System.out.println("Account created successfully!");
    }

    public static boolean login() {
        System.out.print("Enter username: ");
        String u = sc.nextLine();
        System.out.print("Enter password: ");
        String p = sc.nextLine();
        return user.validation_User_Login(u, p);
    }

    public static void inventoryMenu() {
        while (true) {
            System.out.println("\n=== Inventory Menu ===");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Stock");
            System.out.println("4. Show All Products");
            System.out.println("5. Logout");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    inventory.showProduct();
                    break;
                case 5:
                    System.out.println("Logged out successfully.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Product p = new Product(id, name, qty, price);
        inventory.addProduct(p);
    }

    public static void removeProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = sc.nextInt();
        inventory.removeProduct(id);
    }

    public static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter new quantity: ");
        int qty = sc.nextInt();

        inventory.updateStock(id, qty);
    }
}
