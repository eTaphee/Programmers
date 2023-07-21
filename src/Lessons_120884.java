public class Lessons_120884 {
    public static int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        while (coupon != 0) {
            int service = coupon / 10;
            if (service == 0) {
                break;
            }
            answer += service;

            int mod = coupon % 10; // 남는 쿠폰
            coupon = service + mod;
        }

        return answer;
    }
}
