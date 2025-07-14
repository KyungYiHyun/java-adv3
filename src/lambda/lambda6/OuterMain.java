package lambda.lambda6;

public class OuterMain {

    private String message = "외부 클래스";

    public void execute() {
        Runnable anonymous = new Runnable() {
            private String message = "외부 클래스";

            @Override
            public void run() {
                System.out.println("익명클래스 this: " + this);
                System.out.println("익명클래스 this.getClass " + this.getClass());
                System.out.println("this.message = " + this.message);
            }
        };

        // 람다 예시
        Runnable lambda = () -> {
            System.out.println("this = " + this);
            System.out.println("this.getClass() = " + this.getClass());
            System.out.println("this.message = " + this.message);
        };

        anonymous.run();
        lambda.run();
    }

    public static void main(String[] args) {
        OuterMain outer = new OuterMain();
        System.out.println("outer = " + outer);
        outer.execute();
    }
}
