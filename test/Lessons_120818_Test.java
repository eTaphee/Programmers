import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lessons_120818_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120818.solution(150000);
        Assertions.assertEquals(142500, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120818.solution(580000);
        Assertions.assertEquals(464000, answer);
    }
}
