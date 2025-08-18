package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class LentgthOfFruit {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        List<Integer> counts = fruits.stream()
                .map(String::length)
                .toList();

        System.out.println("Using Map : "+counts);

//        List<Integer> counts1 = fruits.stream()
//                        .flatMap(Collection::stream)
//                                .collect(Collectors.toList());
//
//        System.out.println("Using Map : "+counts);
    }
}
