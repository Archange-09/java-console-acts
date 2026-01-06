public class Checker extends values {

    public void check() {

        if (getGuess().equals(getAns())) {
            System.out.println("✅ Correct!");
            incrementScore();
        } else {
            System.out.println("❌ Wrong! The correct answer is: " + getAns());
        }
    }
}
