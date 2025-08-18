package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        OptionalDouble average=numbers.stream()
                .filter(i->i%2==0).mapToDouble(Integer::intValue)
                .average();
        System.out.println(average.getAsDouble());
    }
}
