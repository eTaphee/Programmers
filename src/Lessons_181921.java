import java.util.ArrayList;
import java.util.Arrays;

public class Lessons_181921 {
    public static int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            int n = i;
            boolean fail = false;
            while (n != 0) {
                int mod = n % 10;
                if (mod != 5 && mod != 0) {
                    fail = true;
                    break;
                }
                n/=10;
            }
            if (!fail) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 555)));
        System.out.println(Arrays.toString(solution(10, 20)));
    }
}
