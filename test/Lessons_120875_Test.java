import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120875_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120875.solution(new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}});
        assertEquals(1, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120875.solution(new int[][] {{3, 5}, {4, 1}, {2, 4}, {5, 10}});
        assertEquals(0, answer);
    }

    @Test
    void test_case_3() {
        // [[3, 1], [6, 2], [6, 9], [9, 10]]
        int answer = Lessons_120875.solution(new int[][] {{1, 2}, {5, 2}, {2, 3}, {4, 2}});
        assertEquals(1, answer);
    }
}
