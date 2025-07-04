package lambda.lambda5.mystream;


import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.StringToIntegerMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex2_Student {
    public static void main(String[] args) {
        // 점수가 80점 이상인 학생의 이름을 추출해라.
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );
        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);
        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> direct(List<Student> students) {
        ArrayList<String> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                result.add(student.getName());
            }

        }
        return result;
    }

    private static List<String> lambda(List<Student> students) {
        return StringToIntegerMapper.map(GenericFilter.filter(students, s1 -> s1.getScore() >= 80), s -> s.getName());
    }
}