import java.util.*;

public class Lessons_42578 {
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
        System.out.println(solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}, {"tee", "top"}, {"aa", "top"},{"yellow_hat", "headgear"}}));
    }

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String category = cloth[1];

            map.computeIfPresent(category, (k, v) -> v + 1);
            if (!map.containsKey(category)) {
                map.put(category, 1);
            }
        }

        int answer = 1;
        for (int value : map.values()) {
            answer *= (value + 1);
        }
        return answer - 1;
    }
}
