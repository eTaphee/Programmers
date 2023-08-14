import java.util.*;

public class Lessons_181916 {
    public static int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        if (map.size() == 1) {
            return map.keySet().stream().findFirst().get().intValue() * 1111;
        }

        if (map.size() == 2) {
            Optional<Map.Entry<Integer, Integer>> pEntry = map.entrySet().stream().filter(e -> e.getValue() == 3).findFirst();
            if (pEntry.isPresent()) {
                int p = pEntry.get().getKey();
                int q = map.entrySet().stream().filter(ee->ee.getKey() != p).findFirst().get().getKey();
                return (int)Math.pow(10 * p + q, 2);
            }

            int p = map.entrySet().stream().filter(e -> e.getValue() == 2).findFirst().get().getKey();
            int q = map.entrySet().stream().filter(e -> e.getKey() != p).findFirst().get().getKey();
            return (p+q) * Math.abs(p-q);
        }

        if (map.size() == 3) {
            return map.entrySet().stream().filter(e -> e.getValue() == 1).mapToInt(e -> e.getKey()).reduce(1, (n, m) -> n * m);
        }

        if (map.size() == 4) {
            return map.keySet().stream().min(Comparator.comparingInt(n -> n)).get();
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 2, 2, 2));
        System.out.println(solution(4, 1, 4, 4));
        System.out.println(solution(6, 3, 3, 6));
        System.out.println(solution(2, 5, 2, 6));
        System.out.println(solution(6, 4, 2, 5));
    }
}
