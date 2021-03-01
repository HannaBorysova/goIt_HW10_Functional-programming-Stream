package main.java.com.borysova;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTask {
    private static List<String> names =
            Arrays.asList("Anna", "Marina", "Petro", "Oksana", "Maria");

    public static void main(String[] args) {
        final List<String> result = names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        String stringResult = result.stream().collect(Collectors.joining(", "));
        System.out.println(stringResult);
    }
}
