package lambda.lambda4;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        System.out.println("predicate1.test(4) = " + predicate1.test(4));
        Predicate<Integer> predicate2 = i -> i % 2 == 0;
        System.out.println("predicate2.test(5) = " + predicate2.test(5));

        Function<Integer, Boolean> function = value -> value % 2 ==0;
        System.out.println("function.apply(10) = " + function.apply(10));
    }
}
