package n42840_모의고사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] answers = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(answers)));
    }

    /*
    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
     */
    static int[] solution(int[] answers) {
        int[] ans1 = {1,2,3,4,5};
        int[] ans2 = {2,1,2,3,2,4,2,5};
        int[] ans3 = {3,3,1,1,2,2,4,4,5,5};
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        for (int i = 0; i < answers.length; i++) {
            int a = answers[i];
            if (a == ans1[i==0 ? 0 : i % ans1.length]) cnt1++;
            if (a == ans2[i==0 ? 0 : i % ans2.length]) cnt2++;
            if (a == ans3[i==0 ? 0 : i % ans3.length]) cnt3++;
        }

        int[][] arr = {{1,cnt1}, {2,cnt2}, {3,cnt3}};       //번호와 맞은개수 이중배열로
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) {                           //맞은 개수가 같으면
                return o1[0] - o2[0];                       //번호대로 오름차순
            } else {
                return o2[1] - o1[1];                       //맞은 개수가 다르면 맞은 개수대로 내림차순
            }
        });

        int[] answer = {};
        if (arr[0][1] > arr[1][1]) {
            answer = new int[]{arr[0][0]};
        }
        if (arr[0][1] == arr[1][1]) {
            answer = new int[]{arr[0][0], arr[1][0]};
        }

        if (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) {
            answer = new int[]{1, 2, 3};
        }

        return answer;
    }
}
