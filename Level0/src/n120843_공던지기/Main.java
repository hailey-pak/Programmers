package n120843_공던지기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int[] numbers = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(br.readLine());
        System.out.println(solution(numbers, k));
    }

    static int solution(int[] numbers, int k) {
        int n = 2 * k - 1;
        int idx = numbers.length > n ? n: n % numbers.length;
        idx = idx - 1 < 0 ? numbers.length - 1 : idx - 1;
        return numbers[idx];
    }
}
