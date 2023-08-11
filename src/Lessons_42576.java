import java.util.HashMap;

public class Lessons_42576 {
    public static void main(String[] args) {

    }

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap();

        for (String p : participant) {
            if (!map.containsKey(p)) {
                map.put(p, 0);
            }

            map.put(p, map.get(p) + 1);
        }

        for (String c : completion) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }

        String answer = map.keySet().stream().findFirst().get();
        return answer;
    }
}
