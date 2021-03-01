package main.java.com.borysova;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FirstTask {
    private static List<Names> names = Arrays.asList(new Names(1, "Anna"),
            new Names(2, "Marina"), new Names(3, "Petro"),
            new Names(4, "Oksana"), new Names(5, "Maria"));

    public static void main(String[] args) {
        List<Names> result = names.stream()
                .filter(person -> person.getId() % 2 != 0)
                .collect(Collectors.toList());

        String stringResult = result.stream()
                .map(Names::toString)
                .collect(Collectors.joining(", "));
        System.out.println(stringResult);
    }
}
