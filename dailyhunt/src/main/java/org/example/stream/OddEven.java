package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,10);

        Map<Boolean,List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(x->x%2==0));

        System.out.println(map);
    }
}
