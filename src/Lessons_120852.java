import java.util.Arrays;
import java.util.HashSet;

public class Lessons_120852 {
    public static int[] solution(int n) {
        int[] answer = {};

        HashSet<Integer> set = new HashSet<>();

        int pn = 2;

        while (n > 1) {
            if (isPrimeNumber(pn) == false) {
                pn++;
                continue;
            }

            if (n % pn == 0) {
                set.add((pn));
                n /= pn;
            }
            else {
                pn++;
            }
        }

        answer = set.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i <= number / 2 ; i ++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
