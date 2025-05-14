package Theme_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSortTask {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        ArrayList<Integer> list = new ArrayList() {
            @Override
            public boolean add(Object o) {
                System.out.println("Test: " + o);
                return super.add(o);
            }
        };
        list.add(50320);

    }
}