import java.util.stream.IntStream;

public class Lessons_120813 {
    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(num -> num % 2 == 1).toArray();
    }
}
