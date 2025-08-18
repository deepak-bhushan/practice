package org.example.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerCount {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);

        Map<Integer, Long> occurrences = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrences);
    }
}
