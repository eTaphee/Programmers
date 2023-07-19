public class Lessons_120907 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0 ; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[2]);
            int z = Integer.parseInt(split[4]);
            String op = split[1];
            int xopy = x + ((op.equals("+") ? 1 : -1) * y);
            answer[i] = (xopy == z) ? "O" : "X";
        }

        return answer;
    }
}
