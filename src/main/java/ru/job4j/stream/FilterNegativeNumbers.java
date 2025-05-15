package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        Integer[] num = {1, -1};

        List<Integer> numbers = Arrays.asList(num);
        List<Integer> positive = numbers.stream().filter(
                number -> number > 0).toList();
        positive.forEach(System.out::println);
    }
}