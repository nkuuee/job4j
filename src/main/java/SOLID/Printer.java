package SOLID;

import java.util.List;

public class Printer {
    public void print(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

