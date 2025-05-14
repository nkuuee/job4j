import java.util.HashMap;
import java.util.Map;

public class Test {

    public static Map<Integer, Integer> iterat() {
        HashMap<Integer, Integer> num = new HashMap<>();
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 3};

        for (int n : arr) {
            num.put(n, num.getOrDefault(n, 0) + 1);
        }
        return num;
    }

    public static void uniqNumFind(Map<Integer, Integer> num) {
        for (Map.Entry<Integer, Integer> entry : num.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Уникальное число: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, Integer> integerMap = iterat();
        uniqNumFind(integerMap);

    }
}
