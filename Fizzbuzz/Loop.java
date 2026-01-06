import java.util.Scanner;

public class Loop extends Checker{

    public void loop() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " is: ");
                String guess = sc.next().toLowerCase();
                setGuess(guess);

                if (i % 15 == 0) {
                    setAns("fizzbuzz");
                } else if (i % 5 == 0) {
                    setAns("buzz");
                } else {
                    setAns("fizz");
                }

                check();
                countTotal();
            }
        }
        System.out.println("Score:"+getScore()+"/"+getTotal());
    }
}
