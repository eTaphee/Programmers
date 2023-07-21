import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120884_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120884.solution(100);
        assertEquals(11, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120884.solution(1081);
        assertEquals(120, answer);
    }
}
