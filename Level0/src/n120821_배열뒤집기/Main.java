package n120821_배열뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] numbers = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }
        System.out.print(Arrays.toString(solution(numbers)));

    }

    static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[num_list.length-1-i];
        }
        return answer;
    }
}
