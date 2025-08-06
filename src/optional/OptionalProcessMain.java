package optional;

import java.util.Optional;

public class OptionalProcessMain {

    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        optValue.ifPresent(v -> System.out.println("v = " + v));
        optEmpty.ifPresent(v -> System.out.println("v2 = " + v));

        optValue.ifPresentOrElse(v -> System.out.println("optValue : " + v),
                ()-> System.out.println("optValue는 비어있음")
                );
        optEmpty.ifPresentOrElse(v -> System.out.println("optValue : " + v),
                ()-> System.out.println("optValue는 비어있음")
        );

        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);

        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);

        Optional<Optional<Integer>> nestedOpt = optValue.map(s -> Optional.of(s.length()));

        System.out.println("nestedOpt = " + nestedOpt);
        Optional<Integer> flattenedOpt = optValue.flatMap(s -> Optional.of(s.length()));
        System.out.println("flattenedOpt = " + flattenedOpt);


        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        Optional<String> filtered2 = optValue.filter(s -> s.startsWith("X"));
        System.out.println("filtered1 = " + filtered1);
        System.out.println("filtered2 = " + filtered2);

        optValue.stream()
                .forEach(s -> System.out.println("s = " + s));

        optEmpty.stream()
                .forEach(s -> System.out.println("s = " + s));

    }
}
