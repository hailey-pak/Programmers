package n17680_캐시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] cities = br.readLine().split(", ");

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].replaceAll("\"", "");
        }
        System.out.println(solution(n, cities));
    }

    static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        Queue<String> queue = new LinkedList<>();   //Queue -> FIFO(선입선출)

        int sum = 0;
        for (String s : cities) {
            s = s.toLowerCase();

            if (queue.contains(s)) {
                sum += 1;
                queue.remove(s);        //해당 객체 제거 (제일 마지막에 다시 넣기 위해)

            } else {
                sum += 5;
                if (queue.size() == cacheSize) {
                    queue.remove();     //가장 먼저 들어온 객체 제거
                }
            }
            queue.add(s);
        }

        return sum;
    }
}
