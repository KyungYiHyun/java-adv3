package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain3 {

    public static void main(String[] args) {
        System.out.println("getOperation(\"add\").apply(1,2) = " + getOperation("add").apply(1, 2));
        System.out.println("getOperation(\"sub\").apply(1,2) = " + getOperation("sub").apply(1, 2));
        System.out.println("getOperation(\"aa\").apply(1,2) = " + getOperation("aa").apply(1, 2));
    }

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0;
        }
    }
}
