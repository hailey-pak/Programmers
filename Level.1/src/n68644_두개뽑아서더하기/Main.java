package n68644_두개뽑아서더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(solution(numbers)));
    }

    static int[] solution(int[] numbers) {
        TreeSet<Integer> sum = new TreeSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sum.size()];
        Iterator<Integer> iter = sum.iterator();
        int i = 0;
        while (iter.hasNext()) {
            answer[i++] = iter.next();
        }
        return answer;
    }
}
