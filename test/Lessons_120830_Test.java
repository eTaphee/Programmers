import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120830_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120830.solution(10,3);
        assertEquals(124000, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120830.solution(64,6);
        assertEquals(768000, answer);
    }
}
