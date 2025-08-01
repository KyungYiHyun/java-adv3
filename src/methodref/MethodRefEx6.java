package methodref;

import java.util.function.BiFunction;

public class MethodRefEx6 {

    public static void main(String[] args) {
        Person person = new Person("Kim");

        BiFunction<Person, Integer, String> fun1 = (Person p, Integer number) -> p.introduceWithNumber(number);

        System.out.println("fun1.apply(person, 3) = " + fun1.apply(person, 3));

        BiFunction<Person, Integer, String> fun2 = Person::introduceWithNumber;
        System.out.println("fun2.apply(person,3) = " + fun2.apply(person, 3));
    }
}
