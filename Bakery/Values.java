import java.util.ArrayList;
import java.util.Scanner;

public class Values {
    public class Order {
        String itemName;
        int quantity;
        double subtotal;
        double price;

        public Order(String itemName, int quantity, double price, double subtotal) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
            this.subtotal = subtotal;
        }
    }

    private final Scanner sc = new Scanner(System.in);

    private final double PRICE;
    private String name;
    private int stock;
    private int quantity;
    private String buyerName;
    private ArrayList<Order> orders = new ArrayList<>();
    private double payment;


    protected Values[] items;

    public Values(String name, double PRICE, int stock) {
        this.name = name;
        this.PRICE = PRICE;
        this.stock = stock;
    }

    // Initialize items array
    protected void initializeItems() {
        items = new Values[]{
                new Values("Cheese Bread", 7, 100),
                new Values("Ensaymada", 6, 100),
                new Values("Ham and Cheese", 6, 100),
                new Values("Hopia", 5, 100),
                new Values("Monay", 5, 100),
                new Values("Pan De Coco", 5, 100),
                new Values("Pandesal", 3, 100),
                new Values("Spanish Bread", 5, 100),
                new Values("Putok", 5, 100),
                new Values("Tasty", 7, 100)
        };
    }

    // --- GETTERS ---
    public Scanner getScanner() {return sc;}

    public String getName() { return name; }
    public double getPrice() { return PRICE; }
    public int getStock() { return stock; }
    public int getQuantity() { return quantity; }
    public Values[] getItems() { return items; }
    public String getBuyerName() { return buyerName; }
    public ArrayList<Order> getOrders() { return orders; }
    public double getPayment() {return payment;}

    // --- SETTERS ---
    public void setStock(int stock) { this.stock = stock; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setBuyerName(String buyerName) { this.buyerName = buyerName; }
    public void setPayment(double payment) {this.payment = payment;}
}

