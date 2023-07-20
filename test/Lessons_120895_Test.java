import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120895_Test {
    @Test
    void test_case_1() {
        String answer = Lessons_120895.solution("hello", 1, 2);
        assertEquals("hlelo", answer);
    }

    @Test
    void test_case_2() {
        String answer = Lessons_120895.solution("I love you", 3, 6);
        assertEquals("I l veoyou", answer);
    }
}
