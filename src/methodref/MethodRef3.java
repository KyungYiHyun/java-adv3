package methodref;

import java.util.function.Function;

public class MethodRef3 {

    public static void main(String[] args) {
        Person person1 = new Person("Kim");
        Person person2 = new Person("Park");
        Person person3 = new Person("Lee");


        Function<Person, String> fun1 = (Person person) -> person.introduce();
        System.out.println("fun1.apply(person1) = " + fun1.apply(person1));
        System.out.println("fun1.apply(person2) = " + fun1.apply(person2));
        System.out.println("fun1.apply(person3) = " + fun1.apply(person3));

        Function<Person, String> fun2 = Person::introduce;
        System.out.println("fun2.apply(person1) = " + fun2.apply(person1));
        System.out.println("fun2.apply(person2) = " + fun2.apply(person2));
        System.out.println("fun2.apply(person3) = " + fun2.apply(person3));


    }
}
