

public class Main {

    public static void main(String[] args) {

        System.out.println("=== FizzBuzz ===");
        System.out.println("Guess the correct word for each number!");
        System.out.println("Fizz  → divisible by 3");
        System.out.println("Buzz  → divisible by 5");
        System.out.println("FizzBuzz → divisible by 15");
        System.out.println("Numbers are between 1 and 30.\n");

        Loop l = new Loop();

        l.loop();
    }
}

