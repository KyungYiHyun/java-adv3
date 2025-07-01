package lambda.lambda4;

import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {
        Function<String, Integer> function1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println("function1.apply(\"Heloo\") = " + function1.apply("Heloo"));

        Function<String, Integer> function2 = s -> s.length();

        System.out.println("function2.apply(\"hello\") = " + function2.apply("hello"));

    }
}
