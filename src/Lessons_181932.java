public class Lessons_181932 {
    public static String solution(String code) {
        StringBuilder sb = new StringBuilder();

        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = (mode == 0) ? 1 : 0;
            }
            else if (i % 2 == mode) {
                sb.append(code.charAt(i));
            }
        }

        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }
}
