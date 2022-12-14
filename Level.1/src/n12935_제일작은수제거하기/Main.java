package n12935_제일작은수제거하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr) {
        if (arr.length==1) return new int[]{-1};

        List<Integer> list = new ArrayList<>();
        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (arr[i] < arr[minIdx]) minIdx = i;
        }

        list.remove(minIdx);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
