package com.psh.no81_90.no89;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        System.out.println(Arrays.toString(solution(numbers, n)));
    }

    static int[] solution(int[] numbers, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int number : numbers) set.add(number);
        int[] ans = new int[numbers.length];

        for (int i = 0; i < ans.length; i++) {
            Iterator<Integer> iterator = set.iterator();
            int min = iterator.next();
            while (iterator.hasNext()) {
                int val = iterator.next();
                if (Math.abs(n - val) < Math.abs(n - min)) {
                    min = val;
                } else if (Math.abs(n - val) == Math.abs(n - min) && val > min) {
                    min = val;
                }
            }
            ans[i] = min;
            set.remove(min);
        }

        return ans;
    }
}
