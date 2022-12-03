package n12944_평균구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(arr));
    }

    static double solution(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double)sum / arr.length;
    }
}
