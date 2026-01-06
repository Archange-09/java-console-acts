public class Stocks extends Receipt {
    public Stocks(String name, double price, int stock) {
        super(name, price, stock);
    }

    public void showStocks() {
        while (true) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("                                [Stock Management]                       ");
            System.out.println("-------------------------------------------------------------------------\n");

            for (int i = 0; i < items.length; i++) {
                Values item = items[i];
                System.out.println("[" + (i + 1) + "] " + item.getName() + " - Stock: " + item.getStock());
            }

            System.out.println("\n-------------------------------------------------------------------------");
            System.out.print("Add Stock [1] Yes or [2] No? ");
            int option = InputHelper.enterOption(getScanner(), 1, 2); // Use InputHelper

            if (option == 1){
                System.out.print("Enter item number: ");
                int itemIndex = InputHelper.enterOption(getScanner(), 1, items.length) - 1; // Use InputHelper

                System.out.print("Enter quantity to add: ");
                int quantityToAdd = getScanner().nextInt();
                getScanner().nextLine(); // Consume newline

                // Add to stock
                int currentStock = items[itemIndex].getStock();
                items[itemIndex].setStock(currentStock + quantityToAdd);

                System.out.println("Stocks Added on " + items[itemIndex].getName() + ": New stock is " + items[itemIndex].getStock());
                System.out.println("\nStocks Added Successfully");

                System.out.println("\nDo You Want To Add More? [1] Yes or [2] No?");
                int more = InputHelper.enterOption(getScanner(), 1, 2); // Use InputHelper
                if (more == 2) {
                    break;
                }
            } else {
                break;
            }
        }
    }
}