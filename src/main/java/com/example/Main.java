package com.example;

import com.example.collectmapping.CollectionMapping;
import com.example.collectmapping.StringProcessor;
import com.example.counter.Counter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CollectionMapping<String> collectionMapping = new CollectionMapping<>();
        String[] strings = {"s2", "s2", "s2", "s1", "s4", "s3", "s2"};

        String[] strings1 = collectionMapping.arrayMapping(strings, new StringProcessor());

        System.out.println(Arrays.toString(strings1));

        System.out.println(new Counter<String>().elementsCount(strings));
    }
}