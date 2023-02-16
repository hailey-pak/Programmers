package n49994_방문길이;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dirs = new Scanner(System.in).nextLine();
        System.out.println(solution(dirs));
    }

    static int solution(String dirs) {
        int x = 5, y = 5;
        boolean[][] visited = new boolean[21][21];

        for (char c : dirs.toCharArray()) {
            int sumX = x;
            int sumY = y;

            switch (c) {
                case 'R':
                    if (x < 10) {
                        x++;
                    }
                    break;

                case 'L':
                    if (x > 0) {
                        x--;
                    }
                    break;

                case 'U':
                    if (y < 10) {
                        y++;
                    }
                    break;

                case 'D':
                    if (y > 0) {
                        y--;
                    }
                    break;
            }
            if (sumX == x && sumY == y) {
                continue;
            }
            sumX += x;
            sumY += y;
            visited[sumX][sumY] = true;
        }

        int ans = 0;
        for (boolean[] booleans : visited) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) ans++;
            }
        }
        return ans;
    }
}
