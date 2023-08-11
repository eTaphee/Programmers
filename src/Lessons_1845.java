import java.util.HashMap;
import java.util.HashSet;

public class Lessons_1845 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 3, 1, 2, 3 }));
    }

    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int answer = Math.min(nums.length / 2, set.size());
        return answer;
    }
}
