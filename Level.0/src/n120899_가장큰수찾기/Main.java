package n120899_가장큰수찾기;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] array = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        System.out.print(Arrays.toString(solution(array)));
    }

    static int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) idx = i;
        }
        return new int[]{max, idx};
    }
}
