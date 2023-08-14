import java.util.ArrayList;
import java.util.Arrays;

public class Lessons_181918 {
    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.size() == 0) {
                list.add(arr[i]);
            } else {
                if (list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i]);
                } else {
                    list.remove(list.size() - 1);
                    i--;
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 4, 2, 5, 3})));
    }
}
