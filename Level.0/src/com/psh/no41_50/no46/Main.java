package com.psh.no41_50.no46;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String my_string = new Scanner(System.in).nextLine();
        System.out.println(Arrays.toString(solution(my_string)));
    }

    static int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if ( Character.isDigit(my_string.charAt(i))) {
                list.add(my_string.charAt(i) - '0');
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
