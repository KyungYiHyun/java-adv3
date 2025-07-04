package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> evenNumbers = filterNumber(a -> a % 2 == 0, numbers);
        List<Integer> oddNumbers = filterNumber(a -> a % 2 == 1, numbers);
        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    private static List<Integer> filterNumber(Predicate<Integer> lambda, List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer i : numbers) {
            boolean testResult = lambda.test(i);
            if (testResult) {
                filtered.add(i);
            }
        }

        return filtered;
    }
}
