package n12949_행렬의곱셈;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split("], \\[");
        int[][] arr1 = new int[str.length][];
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll("\\[", "");
            str[i] = str[i].replaceAll("]", "");
            arr1[i] = Arrays.stream(str[i].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        str = sc.nextLine().split("], \\[");
        int[][] arr2 = new int[str.length][];
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll("\\[", "");
            str[i] = str[i].replaceAll("]", "");
            arr2[i] = Arrays.stream(str[i].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int[][] ans = solution(arr1, arr2);
        for (int[] a : ans) {
            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                for (int k = 0; k < arr1[i].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
