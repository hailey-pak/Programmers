package n17686_파일명정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] files = br.readLine().replaceAll("\"", "").split(", ");
        System.out.println(Arrays.toString(solution(files)));
    }

    static String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] arr = new String[files.length][2];

        for (int i = 0; i < files.length; i++) {
            String file = files[i];

            for (int j = 0; j < file.length(); j++) {
                if (Character.isDigit(file.charAt(j))) {
                    arr[i][0] = file.substring(0, j);
                    arr[i][1] = file.substring(j);
                    break;
                }
            }
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0].equalsIgnoreCase(o2[0])) {

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < o1[1].length(); i++) {
                    char c = o1[1].charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                        if (sb.length() == 5) break;
                    } else {
                        break;
                    }
                }
                int num1 = Integer.parseInt(sb.toString());

                sb.delete(0, sb.length());
                for (int i = 0; i < o2[1].length(); i++) {
                    char c = o2[1].charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                        if (sb.length() == 5) break;
                    } else {
                        break;
                    }
                }
                int num2 = Integer.parseInt(sb.toString());

                return num1 - num2;
            } else {
                return o1[0].toLowerCase().compareTo(o2[0].toLowerCase());
            }
        });

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i][0] + arr[i][1];
        }
        return answer;
    }
}
