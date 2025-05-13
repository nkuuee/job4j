import java.util.HashMap;
import java.util.Map;

public class UniqueNumbers {

    public static Map<Integer, Integer> uniq() {
        Map<Integer, Integer> num = new HashMap<>();
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 3};

        for (int n : arr) {
            num.put(n, num.getOrDefault(n, 0) + 1);
        }

        return num;
    }

    public static void uniqFind(Map<Integer, Integer> num) {
        for (Map.Entry<Integer, Integer> entry : num.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("Unique numbers: " + entry.getKey());
            }

        }
    }

    public static void main(String[] args) {
        Map<Integer, Integer> num = uniq();
        uniqFind(num);
    }
}
