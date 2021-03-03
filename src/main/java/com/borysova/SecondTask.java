package main.java.com.borysova;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTask {
    private static List<String> names =
            Arrays.asList("Anna", "Marina", "Petro", "Oksana", "Maria");

    public static void main(String[] args) {
        final String result = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
