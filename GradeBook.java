import java.util.ArrayList;

public class GradeBook {

    private ArrayList<Double> scores;

    public GradeBook() {
        scores = new ArrayList<Double>();
    }

    public void addScore(double score) {
        scores.add(score);
    }

    public double sum() {
        double total = 0.0;
        for (double score : scores) {
            total += score;
        }
        return total;
    }

    public double minimum() {
        double smallest = Double.MAX_VALUE;
        for (double score : scores) {
            if (score < smallest) {
                smallest = score;
            }
        }
        return smallest;
    }

    public int getScoreSize() {
        return scores.size();
    }

    public double finalScore() {
        if (scores.size() == 0) {
            return 0.0;
        }
        else if (scores.size() == 1) {
            return scores.get(0);
        }
        else {
            return sum() - minimum();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double score : scores) {
            sb.append(score).append(" ");
        }
        return sb.toString().trim();
    }
}