public class Receipt extends NewTransaction {
    public Receipt(String name, double price, int stock) {
        super(name, price, stock);
    }

    public void printReceipt() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                                [Order Summary]                           ");
        System.out.println("-------------------------------------------------------------------------\n\n");

        System.out.println("Name of Customer: " + getBuyerName());
        System.out.println("\nOrder/s:");

        double grandTotal = 0;
        int totalQuantity = 0;

        for (Order o : getOrders()) {
            System.out.println(o.itemName + "\t\t\t\t\t\t" + o.price+ "×" + o.quantity + "\t\t" + " = ₱" + o.subtotal);
            grandTotal += o.subtotal;
            totalQuantity += o.quantity;
        }
        System.out.println("Total Quantity of Items: \t\t\t" + totalQuantity);
        System.out.println("Total:\t\t\t\t\t\t\t\t\t\t\t   ₱" + grandTotal);

        do {
            System.out.print("\nPlease Enter Payment: ");
            while (!getScanner().hasNextDouble()) {
                System.out.println("Invalid Input. Please Enter A Valid Amount.");
                getScanner().next();
            }
            double pay = getScanner().nextDouble();
            getScanner().nextLine(); // Consume newline
            setPayment(pay);

            if (grandTotal > getPayment()){
                System.out.println("\nInsufficient Balance! Please Enter Again\n");
                System.out.println("Press [0] To Cancel & Close The Program");
                System.out.println("If You Want To Continue, Enter A Suitable Amount");

                while (!getScanner().hasNextDouble()) {
                    System.out.println("Invalid Input. Please Enter A Valid Amount.");
                    getScanner().next();
                }
                double newPay = getScanner().nextDouble();
                getScanner().nextLine(); // Consume newline

                if(newPay == 0){
                    System.exit(0);
                }
                setPayment(newPay);
            }
        } while (grandTotal > getPayment());

        System.out.println("\nThank You For Your Purchase " + getBuyerName() + "!!!");
        System.out.println("Your Change: \t\t\t\t\t\t\t\t\t\t ₱" + (getPayment() - grandTotal));
        System.out.println("\n\nPress Any Key And Then Enter To Go Back To The Main Menu.");
        getScanner().nextLine();
        // Clear orders for next transaction
        getOrders().clear();
    }
}