package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = filterEvenNumber(numbers);
        System.out.println("evenNumbers = " + evenNumbers);

        List<Integer> oddNumbers = filterOddNumber(numbers);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    private static List<Integer> filterEvenNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer i : filtered) {
            boolean testResult = i % 2 == 0;
            if (testResult) {
                filtered.add(i);
            }
        }

        return filtered;
    }
    private static List<Integer> filterOddNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer i : filtered) {
            boolean testResult = i % 2 == 0;
            if (!testResult) {
                filtered.add(i);
            }
        }

        return filtered;
    }
}
