import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Phaser;
import java.util.stream.Collectors;

public class Lessons_42577 {
    public static void main(String[] args) {
        solution(new String[]{"119", "97674223", "1195524421"});
        solution(new String[]{"123", "456", "789"});
        solution(new String[]{"12", "123", "1235", "567", "88"});
    }

    public static boolean solution(String[] phone_book) {
        HashMap<Integer, HashSet<String>> prefixMap = new HashMap<>();

        for (String phone : phone_book) {
            if (!prefixMap.containsKey(phone.length())) {
                prefixMap.put(phone.length(), new HashSet<>());
            }

            prefixMap.get(phone.length()).add(phone);
        }

        for (String phone : phone_book) {
            for (int key : prefixMap.keySet()) {
                if (phone.length() >= key) {
                    String prefix = phone.substring(0, key);
                    if (prefix.equals(phone)) {
                        continue;
                    }
                    if (prefixMap.get(key).contains(prefix)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
