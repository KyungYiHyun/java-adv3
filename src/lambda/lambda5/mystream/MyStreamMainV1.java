package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamMainV1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        returnValue(numbers);
        methodChain(numbers);
    }

    private static void methodChain(List<Integer> numbers) {
        MyStreamV1 myStream = new MyStreamV1(numbers);
        MyStreamV1 map = myStream
                .filter(n1 -> n1 % 2 == 0)
                .map(n -> n * 2);
        System.out.println(map.toList());
    }

    private static void returnValue(List<Integer> numbers) {
        MyStreamV1 myStream = new MyStreamV1(numbers);
        MyStreamV1 filter = myStream.filter(n -> n % 2 == 0);
        MyStreamV1 map = filter.map(n -> n * 2);
        System.out.println(map.toList());
    }
}
