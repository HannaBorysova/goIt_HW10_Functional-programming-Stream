package main.java.com.borysova;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdTask {

    public static void main(String[] args) {
        String[] array = new String[]{"1, 2, 0", "4, 5"};
        String concat = Stream.of(array).collect(Collectors.joining(", "));
        String result = Stream.of(concat.split(", ")).sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
