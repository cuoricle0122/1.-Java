package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collector.*;
import static java.util.stream.Collectors.toMap;

public class Ex02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "이이름", 'F'));
        students.add(new Student(2, "이이름", 'M'));
        students.add(new Student(3, "이이름", 'F'));
        students.add(new Student(1, "김이름", 'M'));
        students.add(new Student(2, "김이름", 'F'));
        students.add(new Student(3, "김이름", 'M'));
        students.add(new Student(1, "박이름", 'F'));
        students.add(new Student(2, "박이름", 'M'));
        students.add(new Student(3, "박이름", 'F'));

        Map<String, Student> studentMap = students.stream()
                .collect(toMap(s -> s.getBan() + s.getName(), Function.identity()));

        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }
    }
}
