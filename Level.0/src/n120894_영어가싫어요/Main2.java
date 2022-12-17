package n120894_영어가싫어요;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();
        System.out.print(solution(numbers));
    }

    static long solution(String numbers) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            numbers = numbers.replaceAll(arr[i], i+"");
        }
        return Long.parseLong(numbers);
    }
}
