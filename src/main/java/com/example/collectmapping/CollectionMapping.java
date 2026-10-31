package com.example.collectmapping;

import java.util.Arrays;

public class CollectionMapping<T> {

    public CollectionMapping() {
    }

    public T[] arrayMapping(T[] array, Function<T> fun) {
        T[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            newArray[i] = fun.apply(array[i]);
        }
        return newArray;
    }
}
