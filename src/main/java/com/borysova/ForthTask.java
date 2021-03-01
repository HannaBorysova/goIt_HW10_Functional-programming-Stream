package main.java.com.borysova;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForthTask {
    public static Stream<Long> crateLinearCongruentGenerator (long a, long c,
                                                              long m, long seed) {
        if (m >= 2 && (a < m && a >= 0) && (c < m && c >= 0) && (seed < m && seed >= 0)) {
           return Stream.iterate(seed, n -> (a * n + c) % m);
        } else {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        System.out.print(ForthTask.crateLinearCongruentGenerator(
                25214903917L, 11L , (long) Math.pow(2, 48), 100)
        .limit(5)
        .collect(Collectors.toList()));
    }
}
