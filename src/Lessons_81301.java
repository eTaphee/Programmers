import java.util.ArrayList;

public class Lessons_81301 {
    public static int solution(String s) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length;) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                list.add(Integer.parseInt(String.valueOf(arr[i])));
                i++;
            } else {
                switch (arr[i]) {
                    case 'z':
                        list.add(0);
                        i += 4;
                        break;
                    case 'o':
                        list.add(1);
                        i += 3;
                        break;
                    case 't':
                        if (arr[i + 1] == 'w') {
                            list.add(2);
                            i += 3;
                        } else {
                            list.add(3);
                            i += 5;
                        }
                        break;
                    case 'f':
                        if (arr[i + 1] == 'o') {
                            list.add(4);
                            i += 4;
                        } else {
                            list.add(5);
                            i += 4;
                        }
                        break;
                    case 's':
                        if (arr[i + 1] == 'i') {
                            list.add(6);
                            i += 3;
                        } else {
                            list.add(7);
                            i += 5;
                        }
                        break;
                    case 'e':
                        list.add(8);
                        i += 5;
                        break;
                    case 'n':
                        list.add(9);
                        i += 4;
                        break;
                }
            }
        }

        int power = list.size() - 1;
        for (int num : list) {
            answer += (Math.pow(10, power) * num);
            power--;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
    }
}
