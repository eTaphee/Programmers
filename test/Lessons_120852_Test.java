import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120852_Test {
    @Test
    void test_case_1() {
        int[] answer = Lessons_120852.solution(12);
        assertArrayEquals(new int[] { 2, 3 }, answer);
    }

    @Test
    void test_case_2() {
        int[] answer = Lessons_120852.solution(17);
        assertArrayEquals(new int[] { 17 }, answer);
    }

    @Test
    void test_case_3() {
        int[] answer = Lessons_120852.solution(420);
        assertArrayEquals(new int[] { 2, 3, 5, 7 }, answer);
    }

    @Test
    void test_primeNumber_2 () {
        assertEquals(true, Lessons_120852.isPrimeNumber(59));
    }
}
