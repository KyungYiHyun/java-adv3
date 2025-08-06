package optional;

import java.util.Optional;

public class OptionalRetrievalMain {

    public static void main(String[] args) {

        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        System.out.println("optValue.isPresent() = " + optValue.isPresent());
        System.out.println("optEmpty.isEmpty() = " + optEmpty.isEmpty());
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());

        String getValue = optValue.get();
        System.out.println("getValue = " + getValue);

        String value1 = optValue.orElse("기본값");
        System.out.println("value1 = " + value1);

        String value2 = optEmpty.orElse("기본값");
        System.out.println("value2 = " + value2);

        String value3 = optValue.orElseGet(() -> {
            System.out.println("람다 호출");
            return "NewValue";
        });

        String value4 = optEmpty.orElseGet(() -> {
            System.out.println("람다 호출");
            return "NewValue";
        });

        System.out.println("value3 = " + value3);
        System.out.println("value4 = " + value4);

        String value5 = optValue.orElseThrow(() -> new RuntimeException("값이 없음"));
        System.out.println("value5 = " + value5);


        Optional<String> result1 = optValue.or(() -> Optional.of("Fallback"));
        System.out.println("result1 = " + result1);

        Optional<String> result2 = optEmpty.or(() -> Optional.of("Fallback"));
        System.out.println("result2 = " + result2);


    }
}
