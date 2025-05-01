import java.io.FileInputStream;
import java.io.IOException;

public class EvenNumberFile {
    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("data/even.txt")) {
            StringBuilder sb = new StringBuilder();
            int read;

            while ((read = input.read()) != -1) {
                sb.append((char) read);
            }

            String result = sb.toString();
            String[] numbers = result.trim().split("\\s+");

            for (String s : numbers) {
                int x = Integer.parseInt(s);

                if (x % 2 == 0) {
                    System.out.println(x + " - чётное");
                } else {
                    System.out.println(x + " - нечётное");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
