import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons_120819_Test {
    @Test
    void test_case_1() {
        int[] answer = Lessons_120819.solution(5500);
        Assertions.assertArrayEquals(new int[] { 1, 0 }, answer);
    }

    @Test
    void test_case_2() {
        int[] answer = Lessons_120819.solution(15000);
        Assertions.assertArrayEquals(new int[] { 2, 4000 }, answer);
    }
}
