import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120891_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120891.solution(3);
        assertEquals(1, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120891.solution(29423);
        assertEquals(2, answer);
    }
}
