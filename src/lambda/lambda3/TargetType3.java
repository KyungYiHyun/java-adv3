package lambda.lambda3;

import java.util.function.Function;

public class TargetType3 {

    public static void main(String[] args) {
        Function<Integer,String> functionA = i -> "value = " + i;
        Function<Integer,String> functionB = i -> "value = " + i;

        Function<Integer, String> functionC = functionB;
    }
}
