package n42888_오픈채팅방;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //test sample
        String[] arr = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
                "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        System.out.println(Arrays.toString(solution(arr)));
    }

    static String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String[]> list = new ArrayList<>();

        for (String str : record) {
            String[] arr = str.split(" ");
            if (!arr[0].equals("Change")) {
                list.add(new String[]{arr[0], arr[1]});
            }

            if (arr.length == 3) {
                map.put(arr[1], arr[2]);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            String[] arr = list.get(i);

            StringBuilder sb = new StringBuilder();
            sb.append(map.get(arr[1]));
            sb.append("님이 ");

            if (arr[0].equals("Enter")) {
                sb.append("들어왔습니다.");
            } else {
                sb.append("나갔습니다.");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
