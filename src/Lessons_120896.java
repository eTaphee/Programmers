import java.util.HashMap;

public class Lessons_120896 {
    public static String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        map.entrySet().stream().filter(m -> m.getValue() == 1).sorted(java.util.Map.Entry.comparingByKey()).forEach(entry -> {
            sb.append(entry.getKey());
        });

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
        System.out.println(solution("aabb"));
        String aa = solution("aabb");
    }
}
