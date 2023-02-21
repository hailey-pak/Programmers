package n84512_모음사전;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();
        System.out.println(solution(word));
    }

    static int solution(String word) {
        String str = "AEIOU";
        int[] arr = {781, 156, 31, 6, 1};

        int answer = word.length();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            answer += arr[i] * str.indexOf(c);
        }

        return answer;
    }
}
