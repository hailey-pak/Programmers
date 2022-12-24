package n72410_신규아이디추천;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        System.out.println(solution(id));
    }

    static String solution(String id) {

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        id = id.toLowerCase();

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        id = id.replaceAll("[^a-z0-9-_.]", "");

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        id = id.replaceAll("[.]{2,}", ".");

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (id.startsWith(".")) {
            id = id.substring(1);
        }
        if (id.endsWith(".")) {
            id = id.substring(0, id.length()-1);
        }

        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (id.equals("")) {
            id = "a";
        }

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        if (id.length() > 15) {
            id = id.substring(0,15);
        }

        //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (id.endsWith(".")) {
            id = id.substring(0, id.length()-1);
        }

        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (id.length() < 3) {
            id = id + id.substring(id.length()-1).repeat(3 - id.length());
        }

        return id;
    }
}
