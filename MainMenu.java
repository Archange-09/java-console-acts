public class MainMenu extends InventoryReport {
    public MainMenu(String name, double price, int stock) {
        super(name, price, stock);
    }

    public void Menu(){
        while (true) {
            String[] arr = {"New Transaction", "Stocks", "Report", "Exit"};

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("                                [Main Menu]                              ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Please Choose Your Option: \n");

            for (int e = 0; e < arr.length; e++) {
                System.out.println("[" + (e + 1) + "] " + arr[e]);
            }

            System.out.println("-------------------------------------------------------------------------\n");
            System.out.print("Enter Option: ");

            int option = InputHelper.enterOption(getScanner(), 1, 4);;

            switch (option){
                case 1 -> {
                    Transaction();
                    printReceipt();
                }
                case 2 -> showStocks();
                case 3 -> inventoryReport();
                case 4 -> {
                    System.out.println("Thanks For Using The Program. \nRemember To Keep Safe Always.\n*Program Terminated.");
                    return;
                }
            }
        }
    }
}