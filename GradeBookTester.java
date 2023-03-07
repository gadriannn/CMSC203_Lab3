import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeBookTester {

    @Test
    public void testAddScore() {
        GradeBook book = new GradeBook();
        book.addScore(75);
        book.addScore(85);
        book.addScore(90);
        assertEquals("75.0 85.0 90.0", book.toString());
    }

    @Test
    public void testScoreSize() {
        GradeBook book = new GradeBook();
        book.addScore(75);
        book.addScore(85);
        book.addScore(90);
        assertEquals(3, book.getScoreSize());
    }

    @Test
    public void testSum() {
        GradeBook book = new GradeBook();
        book.addScore(75);
        book.addScore(85);
        book.addScore(90);
        assertEquals(250, book.sum(), 0.0001);
    }

    @Test
    public void testMinimum() {
        GradeBook book = new GradeBook();
        book.addScore(75);
        book.addScore(85);
        book.addScore(90);
        assertEquals(75, book.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() {
        GradeBook book = new GradeBook();
        book.addScore(75);
        book.addScore(85);
        book.addScore(90);
        assertEquals(175, book.finalScore(), 0.001);
    }
}
