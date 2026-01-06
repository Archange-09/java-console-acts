import java.util.Scanner;
public class hotel extends info {

    private void processPayment(String room, double price, Scanner sc){
        double adult = getNumAdults();
        double kids = getNumKids();
        double tax = 0.1;

        System.out.println(room);
        System.out.println("Room per person: "+price);
        System.out.println("Number of Adults: "+getNumAdults());
        System.out.println("Number of Kids(50%): "+getNumKids());

        System.out.println("Total: ");
        double sum = (adult * price) + ((kids * price)/2);
        sum += sum*tax;
        System.out.println(sum);

        System.out.print("Payment: ");
        double payment = sc.nextDouble();
        double change = payment-sum;
        System.out.println("Change "+change);

    }

    public void receipt(Scanner sc){

        System.out.println("Reservation Receipt:");

        System.out.println("Room Reserved to: "+ getName());
        System.out.println("Part of the day Reserved in: "+getp_day());
        System.out.println("Time to Reserve: "+getTime());

        System.out.println("Room to Reserve:");
        switch (getRoom()) {
            case "standard" -> processPayment(getRoom().toUpperCase(), getstndPrc(), sc);
            case "deluxe" -> processPayment(getRoom().toUpperCase(), getdlxPrc(), sc);
            case "penthouse" -> processPayment(getRoom().toUpperCase(), getpntPrc(), sc);
            default -> throw new IllegalStateException("Unexpected value: " + getRoom());
        }

    }
}
