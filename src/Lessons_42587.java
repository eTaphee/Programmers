import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Lessons_42587 {
    public static void main(String[] args) {
//        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Process> queue = new LinkedList<>();
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(priorities[i], i));
            maps.put(priorities[i], maps.getOrDefault(priorities[i], 0) + 1);
        }

        while (!queue.isEmpty()) {
            Process process = queue.poll();
            int maxPriority = maps.keySet().stream().mapToInt(Integer::intValue).max().getAsInt();
            if (maxPriority > process.priority) {
                queue.add(process);
                continue;
            }

            int remain = maps.get(maxPriority) - 1;
            if (remain == 0) {
                maps.remove(maxPriority);
            }
            else {
                maps.put(maxPriority, remain);
            }

            answer++;
            if (process.index == location) {
                break;
            }
        }

        return answer;
    }
}

class Process {
    public int priority;
    public int index;

    public Process(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}
