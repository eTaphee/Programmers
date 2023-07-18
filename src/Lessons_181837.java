import java.util.HashMap;
import java.util.Arrays;
public class Lessons_181837 {
    public static int solution(String[] order) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();
        map.put("iceamericano", 4500);
        map.put("americanoice", 4500);
        map.put("icecafelatte", 5000);
        map.put("cafelatteice", 5000);
        map.put("americano", 4500);
        map.put("cafelatte", 5000);
        map.put("anything", 4500);

        map.put("hotamericano", 4500);
        map.put("americanohot", 4500);
        map.put("hotcafelatte", 5000);
        map.put("cafelattehot", 5000);

        // for (String coffee : order) {
        //     answer += map.get(coffee);
        // }

        answer = Arrays.stream(order).mapToInt(s -> map.get(s)).sum();

        return answer;
    }
}
