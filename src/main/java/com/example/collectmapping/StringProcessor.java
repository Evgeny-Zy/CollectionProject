package com.example.collectmapping;

public class StringProcessor implements Function<String> {

    @Override
    public String apply(String o) {
        return o.concat(" обработан");
    }
}
