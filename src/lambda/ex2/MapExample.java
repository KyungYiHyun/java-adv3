package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, StringFunction func) {
        ArrayList<String> result = new ArrayList<>();
        // 코드 작성
        for (String s : list) {
            result.add(func.apply(s));
        }

        return result; // 제거하고 적절한 객체를 반환
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);
        // 1. 대문자 변환
        List<String> map1 = map(words, (String s) -> s.toUpperCase());
        System.out.println("map1 = " + map1);
        // 코드 작성
        // 2. 앞뒤에 *** 붙이기 (람다로 작성)

        List<String> map2 = map(words, (String s) -> "***" + s + "***");
        System.out.println("map2 = " + map2);
        // 코드 작성
    }
}