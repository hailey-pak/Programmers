package n120839_가위바위보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rsp = br.readLine();
        System.out.print(solution(rsp));
    }

    static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            switch (rsp.charAt(i)){
                case '0':
                    answer.append('5');
                    break;
                case '2':
                    answer.append('0');
                    break;
                default:
                    answer.append('2');
            }
        }
        return answer.toString();
    }
}
