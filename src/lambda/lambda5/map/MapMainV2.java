package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        System.out.println("mapString(list,s -> Integer.valueOf(s)) = " + mapString(list, s -> Integer.valueOf(s)));
        System.out.println("mapString(list, s -> s.length()) = " + mapString(list, s -> s.length()));

    }

    private static List<Integer> mapString(List<String> list, Function<String,Integer> function) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : list) {
            numbers.add(function.apply(number));
        }

        return numbers;
    }

}
