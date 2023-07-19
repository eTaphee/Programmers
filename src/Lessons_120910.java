import java.util.stream.IntStream;

public class Lessons_120910 {
    public static int solution(int n, int t) {
        int answer = n;

//        for (int i = 0; i < t; i++) {
//            answer *= 2;
//        }

    //        answer = IntStream.range(0, t).reduce(n, (a, b) -> a * 2);
        answer = n << t;

        return answer;
    }
}
