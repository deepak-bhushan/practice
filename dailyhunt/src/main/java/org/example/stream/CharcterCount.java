package org.example.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharcterCount {
    public static void main(String[] args) {
        String s="deeplie";
        List<Character> duplicatechar=s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream()
                .filter(entry ->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicatechar);

    }}
//d

