package n12935_제일작은수제거하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr) {
        if (arr.length==1) return new int[]{-1};

        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
        }

        int[] answer = new int[arr.length-1];
        System.arraycopy(arr, 0, answer, 0, minIdx);
        if (arr.length - 1 - minIdx >= 0) System.arraycopy(arr, minIdx + 1, answer, minIdx, arr.length - 1 - minIdx);

        return answer;
    }
}
