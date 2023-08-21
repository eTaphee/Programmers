import java.util.Arrays;

public class Lessons_120844 {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int idx = 0;
            switch (direction) {
                case "right":
                    idx = (i + 1) % numbers.length;
                    break;
                case "left":
                    idx = (numbers.length + (i + numbers.length - 1)) % numbers.length;
                    break;
            }
            answer[idx] = numbers[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "left")));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "left")));
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }
}
