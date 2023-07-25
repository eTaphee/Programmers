import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons_120829_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120829.solution(70);
        Assertions.assertEquals(1, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120829.solution(91);
        Assertions.assertEquals(3, answer);
    }

    @Test
    void test_case_3() {
        int answer = Lessons_120829.solution(180);
        Assertions.assertEquals(4, answer);
    }
}
