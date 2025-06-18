package lambda.ex2;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성

        return s -> greeting + ", " + s;
    }

    public static void main(String[] args) {
        // 코드 작성
        StringFunction newFunc = buildGreeter("Hello");
     System.out.println("newFunc.apply(\"입력\") = " + newFunc.apply("입력"));
    }
}