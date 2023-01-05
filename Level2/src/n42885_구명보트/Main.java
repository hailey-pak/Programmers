package n42885_구명보트;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] people = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int limit = sc.nextInt();
        System.out.println(solution(people, limit));
    }

    /**
     * 시간초과
     */
    static int solution(int[] people, int limit) {
        int cnt = 0;
        boolean[] state = new boolean[people.length];
        Arrays.sort(people);

        for (int i = 0; i < people.length; i++) {
            if (state[i]) break;
            state[i] = true;
            cnt++;
            for (int j = people.length - 1; j > i ; j--) {
                if (!state[j] && people[i] + people[j] <= limit) {
                    state[j] = true;
                    break;
                }
            }
        }
        return cnt;
    }
}
