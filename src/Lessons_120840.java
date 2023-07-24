public class Lessons_120840 {
    public static int solution(int balls, int share) {
        int answer = 0;

        double tmp = 1;

        int nm = balls - share;
        nm = (nm == 0) ? 1 : nm;
        while (balls > 1) {
            tmp *= (balls / (double)(nm * share));
            if (nm > 1) {
                nm--;
            }
            if (share > 1) {
                share--;
            }
            if (balls > 1) {
                balls--;
            }
        }

        answer = (int)Math.round(tmp);

        return answer;
    }

    public static int factorial(int number) {
        int result = 1;

        while (number > 1) {
            result *= (number--);
        }

        System.out.println(result);

        return result;
    }
}
