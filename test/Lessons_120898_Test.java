import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120898_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120898.solution("happy birthday!");
        assertEquals(30, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120898.solution("I love you~");
        assertEquals(22, answer);
    }
}
