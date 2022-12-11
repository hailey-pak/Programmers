package n42748_K번째수;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands  = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int n = 0; n < answer.length; n++) {
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];

            int[] arr = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(arr);
            answer[n] = arr[k-1];
        }
        return answer;
    }
}
