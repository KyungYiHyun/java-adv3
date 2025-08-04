package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("evenNumbers1 = " + evenNumbers1);

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("evenNumbers2 = " + evenNumbers2);

        Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(value -> new Integer[value]);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("count = " + count);

        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("sum1 = " + sum1.get());

        Integer sum2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println("sum2 = " + sum2);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("min.get() = " + min.get());

        Optional<Integer> max = numbers
                .stream()
                .max(Integer::compareTo);
        System.out.println("max.get() = " + max.get());


        Integer first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst().get();
        System.out.println("first = " + first);

        Integer any = numbers.stream()
                .filter(n -> n > 5)
                .findAny().get();
        System.out.println("any = " + any);


        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("hasEven = " + hasEven);


        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println("allEven = " + allEven);

        boolean noNegative = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println("noNegative = " + noNegative);

    }
}
