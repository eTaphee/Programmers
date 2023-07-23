public class Lessons_120848 {
    public static int solution(int n) {
        int answer = 0;

        int num = 1;
        int factorial = 1;

        while (factorial <= n) {
            answer = num;
            factorial *= (num++);
        }

        answer -= 1;

        return answer;
    }
}
