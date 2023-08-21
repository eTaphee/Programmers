import java.util.Arrays;
import java.util.HashMap;

public class Lessons_178871 {
    public static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerRankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerRankMap.put(players[i], i);
        }

        for (String call : callings) {
            int idx = playerRankMap.get(call);
            String prevPlayer = players[idx - 1];
            playerRankMap.put(call, idx - 1);
            playerRankMap.put(prevPlayer, idx);
            players[idx] = prevPlayer;
            players[idx - 1] = call;
        }

        return players;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));
    }
}