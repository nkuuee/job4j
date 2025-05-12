package Theme_6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add(123);

        String s = (String) list.get(0);
        Integer s1 = (Integer) list.get(1);
        System.out.println(s);
        System.out.println(s1);

    }
}
