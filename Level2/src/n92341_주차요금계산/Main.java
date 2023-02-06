package n92341_주차요금계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] fees = Arrays.stream(br.readLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        String str = br.readLine().replaceAll("\"", "");
        String[] records = str.split(", ");

        System.out.println(Arrays.toString(solution(fees, records)));
    }

    static int[] solution(int[] fees, String[] records) {
        //fee[0] = 기본 시간(분) fees[1] = 기본 요금(원) fees[2] = 단위 시간(분) fees[3] = 단위 요금(원)
        //records "시각 차량번호 내역"
        //시각은 HH:MM형식 , 차량번호는 `0'~'9'로 구성된 길이 4인 문자열, 내역은 IN/OUT

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String record : records) {
            String[] str = record.split(" ");

            String car = str[1];
            int time = Integer.parseInt(str[0].substring(0, 2)) * 60 + Integer.parseInt(str[0].substring(3, 5));
            if (str[2].equals("IN")) {
                time = time * -1;
            }

            map.put(car, map.getOrDefault(car, 0) + time);   //총 이용시간 누적해서 저장
        }

        //요금 계산
        int[] answer = new int[map.size()];
        int i = 0;

        for (String car : map.keySet()) {
            int time = map.get(car);
            if (time < 1) time += 23 * 60 + 59;     //입차시간만 있으면 시간이 음수이므로 23:59분 더해줌

            answer[i] = fees[1];                    //기본 요금 부과
            if (time >= fees[0] ) {                 //기본 시간보다 이용 시간이 길 때 추과 요금 부과
                time -= fees[0];
                answer[i] += (int) (Math.ceil((double)time / fees[2]) * fees[3]);
            }
            i++;
        }
        return answer;
    }
}
