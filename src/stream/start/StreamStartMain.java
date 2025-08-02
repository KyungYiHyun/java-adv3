package stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {

    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");

        Stream<String> stream = names.stream();
        List<String> result = stream.filter(name -> name.startsWith("B"))
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println("result = " + result);

        for (String s : result) {
            System.out.println(s);
        }

        names.stream().filter(name -> name.startsWith("B"))
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        names.stream()
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
