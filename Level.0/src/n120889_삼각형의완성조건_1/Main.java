package n120889_삼각형의완성조건_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] sides = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.print(solution(sides));
    }

    static int solution(int[] sides) {
//        int max = Arrays.stream(sides).max().getAsInt();
//        int sum = Arrays.stream(sides).sum();
//        return sum - max > max ? 1 : 2;
        int max = Arrays.stream(sides).max().getAsInt();
        int sum = Arrays.stream(sides).sum();
        return sum - max > max ? 1 : 2;
    }
}
