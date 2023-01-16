package n42747_H인덱스;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] citations = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(citations));
    }

    static int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int idx = n - i;
            if (citations[i] >= idx) {
                answer = idx;
                break;
            }
        }
        return answer;
    }
}
