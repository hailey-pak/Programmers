package n43165_타겟넘버;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int answer = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int target = sc.nextInt();

        System.out.println(solution(numbers, target));
    }

    static int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    static void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (target == sum) answer++;
        }
        else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);

        }
    }
}
