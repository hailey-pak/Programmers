package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quiz1_2 {
    /**
     *   파일명은 100 글자 이내로, 영문 대소문자, 숫자, 공백(" "), 마침표("."), 빼기 부호("-")만으로 이루어져 있다.
     *   파일명은 영문자로 시작하며, 숫자를 하나 이상 포함하고 있다.
     *
     *   파일명은 크게 HEAD, NUMBER, TAIL의 세 부분으로 구성된다.
     *      HEAD는 숫자가 아닌 문자로 이루어져 있으며, 최소한 한 글자 이상이다.
     *      NUMBER는 한 글자에서 최대 다섯 글자 사이의 연속된 숫자로 이루어져 있으며, 앞쪽에 0이 올 수 있다. 0부터 99999 사이의 숫자로, 00000이나 0101 등도 가능하다.
     *      TAIL은 그 나머지 부분으로, 여기에는 숫자가 다시 나타날 수도 있으며, 아무 글자도 없을 수 있다.
     *
     *   파일명을 세 부분으로 나눈 후, 다음 기준에 따라 파일명을 정렬한다.
     *      파일명은 우선 HEAD 부분을 기준으로 사전 순으로 정렬한다.
     *      이때, 문자열 비교 시 대소문자 구분을 하지 않는다. MUZI와 muzi, MuZi는 정렬 시에 같은 순서로 취급된다.
     *      파일명의 HEAD 부분이 대소문자 차이 외에는 같을 경우, NUMBER의 숫자 순으로 정렬한다.
     *      9 < 10 < 0011 < 012 < 13 < 014 순으로 정렬된다. 숫자 앞의 0은 무시되며, 012와 12는 정렬 시에 같은 같은 값으로 처리된다.
     *      두 파일의 HEAD 부분과, NUMBER의 숫자도 같을 경우, 원래 입력에 주어진 순서를 유지한다.
     *      MUZI01.zip과 muzi1.png가 입력으로 들어오면, 정렬 후에도 입력 시 주어진 두 파일의 순서가 바뀌어서는 안 된다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] files = br.readLine().replaceAll("\"", "").split(", ");
        System.out.println(Arrays.toString(solution(files)));
    }

    static String[] solution(String[] files) {
        String[] answer = new String[files.length];

        String[][] arr = new String[files.length][3];
        for (int i = 0; i < files.length; i++) {
            String file = files[i];

            int j = 0;
            for (; j < file.length(); j++) {
                if (Character.isDigit(file.charAt(j))) {
                    arr[i][0] = file.substring(0, j);
                    break;
                }
            }
            int idx = j;
            for (; j < file.length(); j++) {
                if (!Character.isDigit(file.charAt(j))) {
                    arr[i][1] = file.substring(idx, j);
                    arr[i][2] = file.substring(j);
                    break;
                }
            }
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0].equalsIgnoreCase(o2[0])) {
                int o1Num = Integer.parseInt(o1[1]);
                int o2Num = Integer.parseInt(o2[1]);
                return o1Num - o2Num;
            } else {
                return o1[0].toLowerCase().compareTo(o2[0].toLowerCase());
            }
        });

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i][0] + arr[i][1] + arr[i][2];
        }
        return answer;
    }
}
