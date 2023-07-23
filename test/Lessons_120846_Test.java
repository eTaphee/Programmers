import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120846_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120846.solution(10);
        assertEquals(5, answer);
    }
    @Test
    void test_case_2() {
        int answer = Lessons_120846.solution(15);
        assertEquals(8, answer);
    }
}
