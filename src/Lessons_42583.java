import java.util.*;

public class Lessons_42583 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println(solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Bridge bridge = new Bridge(bridge_length, weight, truck_weights.length);
        Queue<Truck> trucks = new LinkedList<>();

        for (int i = 0; i < truck_weights.length; i++) {
            trucks.add(new Truck(truck_weights[i]));
        }


        while (!trucks.isEmpty() || bridge.isRemainTruck()) {
            Truck truck = trucks.peek();
            if (bridge.enter(truck)) {
                trucks.poll();
            }
            time++;
            if (!bridge.isRemainTruck()) {
                break;
            }
        }
        return time;
    }
}

class Bridge {
    int length;
    int maxWeight;
    int currentWeight;
    int currentCount;
    int toPassTruckCount;
    int passedTruckCount;
    ArrayList<Truck> buffer = new ArrayList<>();

    public Bridge(int length, int maxWeight, int toPassTruckCount) {
        this.length = length;
        this.maxWeight = maxWeight;
        this.toPassTruckCount = toPassTruckCount;
        this.currentWeight = 0;

        for (int i = 0; i < length; i++) {
            buffer.add(new Truck(0));
        }
    }

    private boolean enableEnter(Truck truck) {
        if (truck == null) {
            return false;
        }

        Truck lastTruck = getLastTruck();
        return (currentWeight + truck.weight - lastTruck.weight) <= maxWeight && currentCount <= length;
    }

    public boolean enter(Truck truck) {
        if (enableEnter(truck)) {
            buffer.add(0, truck);
            Truck lastTruck = buffer.remove(buffer.size() - 1);
            currentCount += (lastTruck.weight > 0) ? 0 : 1;
            currentWeight += (lastTruck.weight > 0) ? (truck.weight - lastTruck.weight) : truck.weight;
            passedTruckCount++;
            return true;
        }

        move();

        return false;
    }

    private void move() {
        Truck lastTruck = getLastTruck();
        if (lastTruck.weight > 0) {
            currentCount--;
            currentWeight -= lastTruck.weight;
        }
        buffer.remove(buffer.size() - 1);
        buffer.add(0, new Truck(0));
    }

    private Truck getLastTruck() {
        return buffer.get(buffer.size() - 1);
    }

    public boolean isRemainTruck() {
        return currentCount > 0 || passedTruckCount < toPassTruckCount;
    }

    public void print() {
        ArrayList<Integer> clone = (ArrayList<Integer>)buffer.clone();
        Collections.reverse(clone);
        System.out.println("다리를 건너는 트럭: " + clone);
    }
}

class Truck {
    int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%d", weight);
    }
}