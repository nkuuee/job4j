package SOLID;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public List<Integer> parserNumbers(String input) {
        String[] arr = input.split(" ");
        List<Integer> result = new ArrayList<>();
        for (String arr1 : arr) {
            result.add(Integer.parseInt(arr1));
        }
        return result;
    }
}
