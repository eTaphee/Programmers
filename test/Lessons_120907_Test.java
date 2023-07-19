import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Lessons_120907_Test {
    @Test
    void test_case_1() {
        String[] answer = Lessons_120907.solution(new String[] { "3 - 4 = -3", "5 + 6 = 11" });
        assertArrayEquals(new String[] { "X", "O" }, answer);
    }

    @Test
    void test_case_2() {
        String[] answer = Lessons_120907.solution(new String[] { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" });
        assertArrayEquals(new String[] { "O", "O", "X", "O" }, answer);
    }
}
