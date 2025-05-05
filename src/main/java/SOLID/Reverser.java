package SOLID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverser {
    public List<Integer> reverse(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>(numbers);
        Collections.reverse(result);
        return result;
    }
}

