public class Lessons_181934 {
    public static int solution(String ineq, String eq, int n, int m) {
        boolean result = false;

        switch (ineq + eq) {
            case "<=":
                result = n <= m;
                break;
            case "<!":
                result = n < m;
                break;
            case ">=":
                result = n >= m;
                break;
            case ">!":
                result = n > m;
                break;
        }

        return result ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 2, 50));
        System.out.println(solution(">", "!", 41, 78));
    }
}
