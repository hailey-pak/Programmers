package n42576_완주하지못한선수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] participant = br.readLine().split(" ");
        String[] completion = br.readLine().split(" ");
        System.out.println(solution(participant, completion));

    }

    static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int n = 0;
        String answer = null;
        for (String com : completion) {
            if (com.equals(participant[n])) {
                n++;
            } else {
                answer = participant[n];
                break;
            }
        }

        return answer == null ? participant[participant.length-1] : answer;
    }
}
