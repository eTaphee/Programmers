import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Lessons_181836_Test {
    @Test
    void test_case_1() {
        String[] answer = Lessons_181836.solution(new String[] { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...." }, 2);
        assertArrayEquals(new String[] { "..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........" }, answer);
    }

    @Test
    void test_case_2() {
        String[] answer = Lessons_181836.solution(new String[] { "x.x", ".x.", "x.x" }, 3);
        assertArrayEquals(new String[] { "xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx" }, answer);
    }
}
