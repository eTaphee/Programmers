import java.util.ArrayList;
import java.util.Arrays;

public class Lessons_181894 {
    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        int left = -1;
        int right = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                left = i;
                break;
            }
        }

        if (left < 0) {
            return new int[]{-1};
        } else {
            for (int i = arr.length - 1; i >= left; i--) {
                if (arr[i] == 2) {
                    right = i;
                    break;
                }
            }
        }

        return Arrays.copyOfRange(arr, left, right + 1);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));
    }
}
