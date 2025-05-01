
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsageLog4j {
    private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        byte one = 1;
        short two = 2;
        int three = 3;
        long four = 4L;
        double five = 5.0D;
        float six = 6.0F;
        char seven = '7';
        boolean eight = true;
        LOG.debug("User info name : {}, age : {}", name, age);
        LOG.debug("Test : {} ", one);
        LOG.debug("Test : {} ", two);
        LOG.debug("Test : {} ", three);
        LOG.debug("Test : {} ", four);
        LOG.debug("Test : {} ", five);
        LOG.debug("Test : {} ", six);
        LOG.debug("Test : {} ", seven);
        LOG.debug("Test : {} ", eight);
    }
}