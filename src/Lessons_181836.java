import java.util.ArrayList;

public class Lessons_181836 {
    public static String[] solution(String[] picture, int k) {
        String[] answer = {};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {

            for (int j = 0; j < k; j++) {
                String str = "";

                for (String pixel : picture[i].split("")) {
                    for (int l = 0; l < k; l++) {
                        str += pixel;
                    }
                }

                list.add(str);
            }

        }

        answer = list.toArray(new String[0]);

        return answer;
    }
}
