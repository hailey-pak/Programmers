package n42889_실패율;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stages = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    static int[] solution(int N, int[] stages) {
        double[] fail = new double[N];
        for (int s : stages) {
            if (s != N + 1) {
                fail[s - 1] += 1;
            }
        }

        int[] answer = new int[N];
        int challenge = stages.length;  //총 도전자 수
        for (int i = 0; i < N; i++) {
            double pass = fail[i];
            fail[i] = pass / challenge; //실패율 저장
            challenge -= pass;          //이전 스테이지 통과한 사람 수 빼기
            answer[i] = i + 1;          //스테이지 번호 순서대로 저장
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                //실패율 크기 비교해서 자리 바꾸고 answer 배열에 담긴 스테이지 자리도 바꿔 줌
                if (fail[j - 1] < fail[j]) {
                    double tmp = fail[j - 1];
                    fail[j - 1] = fail[j];
                    fail[j] = tmp;

                    int tmp2 = answer[j - 1];
                    answer[j - 1] = answer[j];
                    answer[j] = tmp2;
                }
            }
        }
        return answer;
    }
}
