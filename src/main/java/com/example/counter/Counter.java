package com.example.counter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counter<T> {

    public Map<T, Long> elementsCount(T[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
