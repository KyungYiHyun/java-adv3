package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV5 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filter = GenericFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println("filter = " + filter);
    }

}
