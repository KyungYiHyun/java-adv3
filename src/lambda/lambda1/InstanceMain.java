package lambda.lambda1;

import lambda.start.Procedure;

public class InstanceMain {


    public static void main(String[] args) {
        Procedure procedure = () -> {
            System.out.println("hello lambda");
        };

        System.out.println("procedure.getClass() = " + procedure.getClass());
        System.out.println("procedure = " + procedure);


    }

}
