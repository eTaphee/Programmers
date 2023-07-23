public class Lessons_120846 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 3; i <= n; i++) {
            answer += isCompositeNumber(i) ? 1 : 0;
        }

        return answer;
    }

    public static boolean isCompositeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }

            if (count >= 3) {
                return true;
            }
        }

        return false;
    }
}
