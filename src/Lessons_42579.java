import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Lessons_42579 {
    public static void main(String[] args) {
        solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = plays;
        ArrayList<Integer> album = new ArrayList<>();

        HashMap<String, ArrayList<GenreInfo>> genreMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];

            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
            }

            genreMap.get(genre).add(new GenreInfo(plays[i], i));
        }

        HashMap<Integer, String> playMap = new HashMap<>();
        genreMap.forEach((k, v) -> {
            v.sort((o1, o2) -> Integer.compare(o1.play, o2.play) * -1);
            genreMap.put(k, v);
            int totalPlays = v.stream().mapToInt(vv -> vv.play).sum();
            playMap.put(totalPlays, k);
        });

//        System.out.println(playMap);
//        System.out.println(genreMap);

        int[] sortedPlays = playMap.keySet().stream().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
        for (int play : sortedPlays) {
            ArrayList<GenreInfo> genreList = genreMap.get(playMap.get(play));
            for (GenreInfo info : genreList.subList(0, Math.min(2, genreList.size()))) {
                album.add(info.index);
            }
        }

        return album.stream().mapToInt(Integer::intValue).toArray();
    }
}

class GenreInfo  {
    public int play;
    public int index;

    public GenreInfo(int play, int index) {
        this.play = play;
        this.index = index;
    }

    public int getPlay() {
        return play;
    }

    @Override
    public String toString() {
        return String.format("{ play=%d, index=%d }", play, index);
    }
}
