import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_181837_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_181837.solution(new String[]{ "cafelatte", "americanoice", "hotcafelatte", "anything" });
        assertEquals(19000, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_181837.solution(new String[]{ "americanoice", "americano", "iceamericano" });
        assertEquals(13500, answer);
    }
}
