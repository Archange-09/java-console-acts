public class values {
    private String guess;
    private String ans;

    private int score=0;
    private int total=0;

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getGuess() {
        return guess;
    }

    public String getAns() {
        return ans;
    }

    public int getScore() {return score;}
    //public void setScore(int score) {this.score = score;}
    public void incrementScore(){this.score++;}

    public int getTotal() {return total;}
    //public void countTotal(int total) {this.total = total;}
    public void countTotal() {this.total++;}
}
