package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV4 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");
        List<Integer> list2 = List.of(1,2,3,4);

        System.out.println("StringToIntegerMapper.map(list, s -> Integer.valueOf(s)) = " + StringToIntegerMapper.map(list, s -> Integer.valueOf(s)));

        System.out.println("StringToIntegerMapper.map(list2,n -> String.valueOf(n)) = " + StringToIntegerMapper.map(list2, n -> n / 2));

    }


}
