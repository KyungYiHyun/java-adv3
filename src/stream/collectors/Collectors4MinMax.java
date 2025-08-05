package stream.collectors;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4MinMax {
    public static void main(String[] args) {
        Integer max1 = Stream.of(1, 2, 3).collect(Collectors.maxBy((i1, i2) -> i1.compareTo(i2))).get();

        Integer max2 = Stream.of(1, 2, 3)
                .max(Integer::compareTo).get();

        int max4 = IntStream.of(1, 2, 3).max().getAsInt();
        System.out.println("max4 = " + max4);


    }
}
