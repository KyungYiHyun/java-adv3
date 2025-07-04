package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;

public class MapMainV1 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        List<Integer> numbers = mapStringToInteger(list);
        System.out.println("numbers = " + numbers);

        List<Integer> integers = mapStringToLength(list);
        System.out.println("integers = " + integers);

    }

    private static List<Integer> mapStringToInteger(List<String> list) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : list) {
            numbers.add(Integer.valueOf(number));
        }

        return numbers;
    }

    private static List<Integer> mapStringToLength(List<String> list) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : list) {
            numbers.add(number.length());
        }

        return numbers;
    }
}
