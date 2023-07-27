import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons_120816_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120816.solution(7, 10);
        Assertions.assertEquals(2, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120816.solution(4, 12);
        Assertions.assertEquals(3, answer);
    }
}
