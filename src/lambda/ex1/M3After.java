package lambda.ex1;

import lambda.start.Procedure;

import java.util.Arrays;

public class M3After {

    public static void main(String[] args) {
        Procedure sum = new Procedure(){
            @Override
            public void run() {
                int N = 100;
                long sum = 0;
                for (int i = 1; i <= N; i++) {
                    sum += i;
                }

                System.out.println("결과: " + sum);
            }
        };

        Procedure sort = new Procedure(){
            @Override
            public void run() {
                int[] arr = { 4, 3, 2, 1 };
                System.out.println("원본 배열: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
            }
        };

        measure(sum);
        measure(sort);
    }

    public static void measure(Procedure procedure) {
        long startMs = System.currentTimeMillis();
        procedure.run();
        long endMS = System.currentTimeMillis();
        System.out.println("실행시간 : " + (endMS - startMs) + "ms");
    }
}
