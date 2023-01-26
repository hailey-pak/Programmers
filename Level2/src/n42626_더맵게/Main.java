package n42626_더맵게;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scoville = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();
        System.out.println(solution(scoville, k));
    }

    static int solution(int[] scoville, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.add(s);
        }

        int answer = 0;
        while (queue.size() >= 2) {
            if (queue.peek() >= k) {
                break;
            }

            int mix = queue.poll() + (queue.poll() * 2);
            queue.add(mix);
            answer++;
        }
        return queue.peek() < k ? -1 : answer;
    }
}
