import java.util.Arrays;

public class Lessons_120585 {
    public static int solution(int[] array, int height) {
        int answer = (int)Arrays.stream(array).filter(m -> m > height).count();
        return answer;
    }
}
