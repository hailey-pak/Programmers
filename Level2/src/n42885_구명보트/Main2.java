package n42885_구명보트;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] people = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int limit = sc.nextInt();
        System.out.println(solution(people, limit));
    }

    static int solution(int[] people, int limit) {
        int cnt = 0, idx = 0;
        Arrays.sort(people);

        for (int i = people.length - 1; i >= idx; i--) {
            cnt++;
            if (people[i] + people[idx] <= limit) {
                idx++;
            }
        }
        return cnt;
    }
}
