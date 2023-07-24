import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lessons_120840_Test {
    @Test
    void test_case_1() {
        int answer = Lessons_120840.solution(3,2);
        assertEquals(3, answer);
    }

    @Test
    void test_case_2() {
        int answer = Lessons_120840.solution(30,1);
        assertEquals(30, answer);
    }

    @Test
    void test_case_3() {
        int answer = Lessons_120840.solution(30,5);
        assertEquals(29*27*26*7, answer);
    }

    @Test
    void test_case_4() {
        int answer = Lessons_120840.solution(30,4);
        assertEquals(29*27*7*5, answer);
    }

    @Test
    void test_factorial() {
        long answer = Lessons_120840.factorial(30);
        assertEquals(1, answer);
    }
}
