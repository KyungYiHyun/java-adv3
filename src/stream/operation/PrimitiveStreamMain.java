package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {

    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        IntStream range1 = IntStream.range(1, 6);
        IntStream range2 = IntStream.rangeClosed(1, 6);
        range1.forEach(i -> System.out.println(i + " "));
        range2.forEach(i -> System.out.println(i + " "));
        System.out.println();

        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        double avg = IntStream.range(1, 6)
                .average().getAsDouble();
        System.out.println("avg = " + avg);

        IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        System.out.println("stats.getSum() = " + stats.getSum());
        System.out.println("stats.getAverage() = " + stats.getAverage());
        System.out.println("stats.getMax() = " + stats.getMax());
        System.out.println("stats.getCount() = " + stats.getCount());

        LongStream longStream = IntStream.range(1, 6).asLongStream();

        DoubleStream doubleStream = IntStream.range(1, 6).asDoubleStream();

        Stream<Integer> boxedStream = IntStream.range(1, 6).boxed();

        LongStream mappedToLong = IntStream.range(1, 6)
                .mapToLong(i -> i * 10L);


        DoubleStream mappedToDouble = IntStream.range(1, 6)
                .mapToDouble(i -> i * 10);

        Stream<String> mappedToObj = IntStream.range(1, 5)
                .mapToObj(i -> "Number " + i);


        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = integerStream.mapToInt(i -> i);
        System.out.println("intStream.sum() = " + intStream.sum());




    }
}
