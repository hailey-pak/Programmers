package n67256_키패드누르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String hand = br.readLine();
        System.out.println(solution(numbers, hand));
    }

    static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int[][] gap2 = {{1, 3, 5}, {4, 6, 8}, {7, 0, 9}, {-1}};
        int[][] gap5 = {{2, 4, 6, 8}, {1, 3, 7, 9, 0}, {-1}};
        int[][] gap8 = {{5, 7, 9, 0}, {2, 4, 6, -1}, {1, 3}};
        int[][] gap0 = {{8, -1}, {5, 7, 9}, {2, 4, 6}, {1, 3}};

        HashMap<Integer, String> map = new HashMap<>() {{
            put(1, "L");
            put(4, "L");
            put(7, "L");
            put(3, "R");
            put(6, "R");
            put(9, "R");
        }};

        int curL = -1, curR = -1;
        for (int n : numbers) {
            String str = null;
            int gapL = -1, gapR = -1;
            switch (n) {
                case 2:
                    for (int i = 0; i < gap2.length; i++) {
                        for (int j : gap2[i]) {
                            if (curL==j) gapL = i;
                            if (curR==j) gapR = i;
                        }
                    }
                    break;
                case 5 :
                    for (int i = 0; i < gap5.length; i++) {
                        for (int j : gap5[i]) {
                            if (curL==j) gapL = i;
                            if (curR==j) gapR = i;
                        }
                    }
                    break;
                case 8:
                    for (int i = 0; i < gap8.length; i++) {
                        for (int j : gap8[i]) {
                            if (curL==j) gapL = i;
                            if (curR==j) gapR = i;
                        }
                    }
                    break;
                case 0 :
                    for (int i = 0; i < gap0.length; i++) {
                        for (int j : gap0[i]) {
                            if (curL==j) gapL = i;
                            if (curR==j) gapR = i;
                        }
                    }
                    break;
                default:
                    str = map.get(n);
                    break;
            }

            if (str == null) {
                if (gapL < gapR) {
                    str = "L";
                } else if (gapR < gapL) {
                    str = "R";
                } else {
                    if (hand.equals("left")) {
                        str = "L";
                    } else {
                        str = "R";
                    }
                }
            }

            sb.append(str);
            if (str.equals("L")) {
                curL = n;
            } else {
                curR = n;
            }
        }
        return sb.toString();
    }
}
