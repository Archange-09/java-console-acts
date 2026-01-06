public class InventoryReport extends Stocks {
    public InventoryReport(String name, double price, int stock) {
        super(name, price, stock);
    }

    public void inventoryReport(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                                [Inventory Report]                        ");
        System.out.println("-------------------------------------------------------------------------\n");

        for (int i = 0; i < items.length; i++) {
            Values item = items[i];
            System.out.println("[" + (i + 1) + "] " + item.getName() + " - Stock: " + item.getStock());
        }

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nPress Any Key And Then Enter To Go Back To The Main Menu.");
        getScanner().nextLine();
    }
}