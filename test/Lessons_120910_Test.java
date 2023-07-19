import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120910_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120910.solution(2,10);
        assertEquals(2048, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120910.solution(7,15);
        assertEquals(229376, answer);
    }
}
