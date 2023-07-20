import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lessons_120895 {
    public static String solution(String my_string, int num1, int num2) {
        List<String> list =  Arrays.asList(my_string.split(""));
        Collections.swap(list, num1, num2);
        String answer = list.stream().reduce("", (s1, s2) -> s1 + s2).toString();
        return answer;
    }
}
