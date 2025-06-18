package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple4 {

    public static void main(String[] args) {


        MyCall call1 = (value) -> value * 3;
        MyCall call2 = value -> value * 3;

        System.out.println("call2.call(34) = " + call2.call(34));
    }

    interface MyCall {
        int call(int value);
    }
}
