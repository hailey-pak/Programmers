package level2_n2549_H인덱스;

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
        int ans = 0;
        for (int i = 0; i < citations.length; i++) {
            int n = citations[i];

            if (citations.length - i <= n) {
                ans = citations.length - i;
                break;
            }
        }
        return ans;
    }
}
