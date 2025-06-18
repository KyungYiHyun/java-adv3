package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {

        MyFunction function1 = (a, b) -> {
            return a + b;
        };

        System.out.println("function1.apply(1,2) = " + function1.apply(1, 2));

        MyFunction function2 = ( a,  b) -> a + b;

        System.out.println("function2.apply(1,2) = " + function2.apply(1, 2));

        MyFunction function3 = ( a,  b) -> {
            System.out.println("람다 실행");
            return a + b;
        };

        System.out.println("function3.apply(1,2) = " + function3.apply(1, 2));

    }
}
