import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumbersTest {

    @Test
    void uniq() {
        Map<Integer, Integer> expected = new HashMap<>();

        expected.put(1, 2);
        expected.put(2, 2);
        expected.put(3, 3);
        expected.put(4, 2);
        expected.put(5, 1);

        Map<Integer, Integer> actual = UniqueNumbers.uniq();

        assertEquals(expected, actual);
    }

    @Test
    void uniqFind() {
        Map<Integer, Integer> input = new HashMap<>();

        input.put(1, 2);
        input.put(2, 2);
        input.put(3, 3);
        input.put(4, 2);
        input.put(5, 1);

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        UniqueNumbers.uniqFind(input);

        String output = out.toString().trim();
        assertTrue(output.contains("Unique numbers: 5"));
        assertFalse(output.contains("Unique numbers: 1"));
    }
}
