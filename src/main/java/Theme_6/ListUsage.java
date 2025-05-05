package Theme_6;

import java.util.ArrayList;
import java.util.List;

public class ListUsage {
    public static void main(String[] args) {
        List<Integer> now = new ArrayList<>();
        now.add(5);
        now.add(6);
        now.add(7);
        for (Integer now1 : now) {
            System.out.println(now1);
        }
    }
}
