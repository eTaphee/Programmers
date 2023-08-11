
public class Lessons_12909 {
    public static void main(String[] args) {
        solution("()()");
        solution("(())()");
        solution(")()(");
        solution("(()()");
    }

    static boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        for (char c : s.toCharArray()) {
            cnt += (c == '(') ? 1 : -1;
            if (cnt < 0) {
                break;
            }
        }
        answer = (cnt == 0);
        System.out.println(answer);
        return answer;
    }
}
