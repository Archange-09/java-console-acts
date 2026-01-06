public class NewTransaction extends Values {
    public NewTransaction(String name, double price, int stock) {
        super(name, price, stock);
        initializeItems(); // Initialize the items array
    }

    public void Transaction() {

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                                [Order]                              ");
        System.out.println("-------------------------------------------------------------------------");

        System.out.print("Name of Customer: ");
        setBuyerName(getScanner().nextLine());

        do {

            System.out.println("\nPlease Select Your Order: ");
            for (int i = 0; i < items.length; i++) {
                Values currentItem = items[i];
                System.out.println("[" + (i + 1) + "] " + currentItem.getName() + " - ₱" + currentItem.getPrice());
            }
            System.out.println("-------------------------------------------------------------------------\n\n");

            System.out.print("Enter Item: ");
            int itemIndex = InputHelper.enterOption(getScanner(), 1, items.length) - 1; // Use InputHelper
            String orderedItem = items[itemIndex].getName();

            System.out.print("Quantity: ");
            int quan = InputHelper.enterOption(getScanner(), 1, items[itemIndex].getStock()); // Use InputHelper
            setQuantity(quan);

            // Update stock
            int newStock = items[itemIndex].getStock() - getQuantity();
            items[itemIndex].setStock(newStock);

            double price = items[itemIndex].getPrice();
            double subtotal = getQuantity() * price;
            getOrders().add(new Order(orderedItem, getQuantity(), price, subtotal));  // Add price

            System.out.println("Do You Want Another Order? [1] Yes [2] No");
            int choice = InputHelper.enterOption(getScanner(), 1, 2); // Use InputHelper
            if (choice == 2) {
                break;
            }
        } while (true);
    }

}