package com.example;

import com.example.collectmapping.CollectionMapping;
import com.example.collectmapping.StringProcessor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CollectionMapping<String> collectionMapping = new CollectionMapping<>();
        String[] strings = {"s1", "s2", "s3"};

        String[] strings1 = collectionMapping.arrayMapping(strings, new StringProcessor());

        System.out.println(Arrays.toString(strings1));

    }
}