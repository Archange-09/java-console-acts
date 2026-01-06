import java.util.Scanner;

public class Fizzbuzz2 {

    public static void main(String[] args) {

        System.out.println("Fizzbuzz 2");
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess if it is:");
        System.out.println("Fizz divisible by 3");
        System.out.println("Buzz divisible by 5");
        System.out.println("Fizzbuzz divisible by 15");
        System.out.println("If none of the above, then type the number!");
        System.out.println("Up to 30\n");


        for (int i = 0; i <= 30; i++) {

            if (i == 0) {
                System.out.println("0");
                continue;
            }

            System.out.print(i+ " is: ");
            String guess = sc.next().toLowerCase();
            String ans = String.valueOf(i);

            if (i % 15 == 0) {
                ans = "Fizzbuzz";
            }
            else if (i % 5 == 0) {
                ans = "Buzz";
            }

            else if (i % 3 == 0) {
                ans = "Fizz";
            }

            if (guess.equals(ans.toLowerCase())) {
                System.out.println("Correct");
            }
            else {
                System.out.println("Wrong! The correct answer is: "+ans);
            }

        }
        sc.close();
    }
}