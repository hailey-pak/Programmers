package com.n42840;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
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

        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(Math.max(cnt1, cnt2), cnt3);
        if (max == cnt1) list.add(1);
        if (max == cnt2) list.add(2);
        if (max == cnt3) list.add(3);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
