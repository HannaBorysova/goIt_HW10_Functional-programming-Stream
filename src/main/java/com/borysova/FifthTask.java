package main.java.com.borysova;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FifthTask {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> i1 = first.iterator();
        Iterator<T> i2 = second.iterator();
        Stream<T> resultStream = Stream.empty();
        while (i1.hasNext() & i2.hasNext()){
            resultStream = Stream.concat(resultStream, Stream.of(i1.next(),
                    i2.next()));
        }
        return resultStream;
    }

    public static void main(String[] args) {
        System.out.println(FifthTask.zip(Arrays.stream(new String[]{"A", "B", "C"}),
                Arrays.stream(new String[]{"N", "H", "K"}))
                .collect(Collectors.joining(", ")));
    }
}
