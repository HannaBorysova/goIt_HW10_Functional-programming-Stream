package main.java.com.borysova;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdTask {

    public static void main(String[] args) {
        String[] array = new String[]{"1, 2, 0", "4, 5"};
        List<String> arrayList= Arrays.asList(array);
        String result = arrayList.stream()
                .flatMap((element) -> Arrays.asList(element.split(", ")).stream())
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
