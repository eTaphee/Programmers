public class Lessons_120891 {
    public static int solution(int order) {
        int answer = 0;

        while (order != 0) {
            int mod = order % 10;
            if (mod != 0 && mod % 3 == 0) {
                answer++;
            }
            order /= 10;
            System.out.println(mod);
        }

        return answer;
    }
}
