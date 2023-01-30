package n87946_피로도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static boolean[] visited;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        String str = br.readLine();
        str = str.substring(1, str.length()-1);
        String[] arr = str.split("],\\[");

        int[][] dungeons = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            dungeons[i] = Arrays.stream(arr[i].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println(solution(k, dungeons));
    }

    static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);
        return max;
    }

    static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        max = Math.max(max, depth);
    }
}
