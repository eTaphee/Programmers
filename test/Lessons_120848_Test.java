import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120848_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120848.solution(3628800);
        assertEquals(10, answer);
    }
    @Test
    void test_case_2() {
        int answer = Lessons_120848.solution(7);
        assertEquals(3, answer);
    }
}
