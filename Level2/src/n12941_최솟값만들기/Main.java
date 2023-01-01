package n12941_최솟값만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(A, B));
    }

    static int solution(int[] A, int[] B) {
        int sum = 0;
        int len = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < len; i++) {
            sum += A[i] * B[len-1-i];
        }
        return sum;
    }

}
