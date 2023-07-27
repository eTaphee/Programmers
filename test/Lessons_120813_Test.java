import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons_120813_Test {
    @Test
    void test_case_1() {
        int[] answer = Lessons_120813.solution(10);
        Assertions.assertArrayEquals(new int[] { 1, 3, 5, 7 , 9 }, answer);
    }

    @Test
    void test_case_2() {
        int[] answer = Lessons_120813.solution(15);
        Assertions.assertArrayEquals(new int[] { 1, 3, 5, 7 , 9, 11, 13, 15 }, answer);
    }
}
