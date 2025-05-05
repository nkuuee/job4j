package SOLID;

import java.util.ArrayList;
import java.util.List;

public class Filters {
    public List<Integer> evenNumbers(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }
}
