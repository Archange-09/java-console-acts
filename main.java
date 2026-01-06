import java.util.Scanner;

public class main {
    public static void main (String [] args){

        while (true) {
            entry();
        }
    }

    public static void entry(){

        Scanner sc = new Scanner(System.in);
        hotel h = new hotel();

        System.out.println("Would You Like To Check-in?(Yes or No)");
        String ans = sc.nextLine().toLowerCase();

        if (ans.equals("yes")) {

            System.out.print("Name: ");
            String name = sc.nextLine();
            h.SetName(name);

            System.out.print("Part of the day reserve in (Morning, Afternoon, or Evening): ");
            String day = sc.nextLine();
            h.setp_day(day);

            System.out.print("Time: ");
            String time = sc.nextLine();
            h.setTime(time);

            System.out.print("Room to Reserve (Penthouse, Deluxe, or Standard): ");
            String room = sc.nextLine().toLowerCase();
            h.setRoom(room);

            System.out.print("Number of Adults: ");
            int numAdults = sc.nextInt();
            h.setNumAdults(numAdults);

            System.out.print("Number of Kids: ");
            int numKids = sc.nextInt();
            h.setNumKids(numKids);
            System.out.println();

            h.receipt(sc);

            System.out.println("Thanks for Reserving");

        } else if (ans.equals("no")) {
            System.out.println("Have a Good Day");
            System.exit(0);
        }

    }
}
