import java.util.HashMap;

public class Lessons_120875 {
    public static int solution(int[][] dots) {
        int answer = 0;

        HashMap<Double, Integer> map = new HashMap<>();

// 잘 못 이해한 코드
//        for (int i = 0; i < dots.length; i++) {
//            int x1 = dots[i][0];
//            int y1 = dots[i][1];
//            for (int j = i + 1; j < dots.length; j++) {
//                int x2 = dots[j][0];
//                int y2 = dots[j][1];
//
//                double slope = (double)(y2 - y1) / (double)(x2 - x1);
//
//                if (slope == -0.0) {
//                    slope = Math.abs(slope);
//                }
//
//                map.put(slope, map.getOrDefault(slope, 0) + 1);
//            }
//        }

//        answer = map.entrySet().stream().anyMatch(e -> e.getValue() >= 2) ? 1 : 0;

        int ax = dots[0][0];
        int ay = dots[0][1];
        int bx = dots[1][0];
        int by = dots[1][1];
        int cx = dots[2][0];
        int cy = dots[2][1];
        int dx = dots[3][0];
        int dy = dots[3][1];

        double ab = (by - ay) / (double)(bx - ax);
        double cd = (cy - dy) / (double)(cx - dx);
        double ac = (cy - ay) / (double)(cx - ax);
        double bd = (dy - by) / (double)(dx - bx);
        double ad = (dy - ay) / (double)(dx - ax);
        double bc = (cy - by) / (double)(cx - bx);

        answer = (ab == cd || ac == bd || ad == bc) ? 1 : 0;

        return answer;
    }
}
