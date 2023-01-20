package n42587_프린터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] priorities = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int location = Integer.parseInt(br.readLine());

        System.out.println(solution(priorities, location));
    }

    static int solution(int[] priorities, int location) {
        if (priorities.length == 1) return 1;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : priorities) {
            q.add(p);
        }

        int n = 0;
        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == q.peek()) {
                    n++;
                    if (i == location) {
                        return n;
                    }
                    q.poll();
                }
            }
        }
        return n;
    }

}
