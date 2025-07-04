package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.StringToIntegerMapper;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static lambda.lambda5.filter.GenericFilter.*;
import static lambda.lambda5.map.StringToIntegerMapper.*;

public class Ex1_Number {
    public static void main(String[] args) {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);
        List<Integer> lambdaResult = lambda(numbers);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    static List<Integer> direct(List<Integer> numbers) {
        // TODO 코드 작성
        ArrayList<Integer> answer = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                answer.add(number * 2);
            }
        }
        return answer;
    }

    static List<Integer> lambda(List<Integer> numbers) {
        // TODO 코드 작성
        return map(filter(numbers, n1 -> n1 % 2 == 0), n -> n * 2);
    }
}