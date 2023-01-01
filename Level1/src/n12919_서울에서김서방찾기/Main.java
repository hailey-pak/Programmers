package n12919_서울에서김서방찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] seoul = br.readLine().split(" ");
        System.out.println(solution(seoul));
    }

    static String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                sb.append(i);
                break;
            }
        }
        sb.append("에 있다");
        return sb.toString();
    }
}
