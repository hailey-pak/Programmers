package n120888_중복된문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        System.out.println(solution(my_string));
    }

    static String solution(String my_string) {
       return my_string.chars().mapToObj(Character::toString)
               .distinct().collect(Collectors.joining());
    }
}
