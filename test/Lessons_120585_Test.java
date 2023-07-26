import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons_120585_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120585.solution(new int[] { 149, 180, 192, 170 }, 167);
        Assertions.assertEquals(3, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120585.solution(new int[] { 180, 120, 140 }, 190);
        Assertions.assertEquals(0, answer);
    }
}
