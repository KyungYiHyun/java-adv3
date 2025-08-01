package methodref;

import lambda.lambda5.mystream.MyStreamMainV3;
import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class MethodRef5 {

    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Kim"), new Person("Park"), new Person("Lee"));

        List<String> result1 = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();

        System.out.println("result1 = " + result1);
    }

}
