package th.ac.ku.javareview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void testTotalScoresInteger() {
        Student student = new Student(1, "One");

        student.addScore(8);
        student.addScore(10);

        // assertEquals(expected, actual)
        assertEquals(18, student.getTotalScore());
    }

    @Test
    void testGetTotalScoresDouble() {
        Student student = new Student(1, "One");

        student.addScore(8.24);
        student.addScore(10.927);
        double result = student.getTotalScore();

        assertEquals(19.167, result, 0.00001);

        // can access other package
        System.out.println(student.aaa);
    }
}
