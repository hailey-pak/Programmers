package n17681_1차_비밀지도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s1 = Integer.toBinaryString(arr1[i]);
            if (s1.length() != n) {
                s1 = "0".repeat(n - s1.length()) + s1;
            }
            String s2 = Integer.toBinaryString(arr2[i]);
            if (s2.length() != n) {
                s2 = "0".repeat(n - s2.length()) + s2;
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (s1.charAt(j) == '0' && s2.charAt(j) == '0') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
