
import java.io.FileOutputStream;
import java.io.IOException;

public class ResultFile {

    static String umnozhenie() {
        StringBuilder sb = new StringBuilder();
        String result = null;
        for (int i = 2; i <= 9; i++) {
            sb.append('\n');
            for (int j = 1; j <= 10; j++) {
                result = String.valueOf(sb.append(i + " * " + j + " = " + i * j).append('\n'));
            }
        }
        return result;
    }


    public static void main(String[] args) {

        try (FileOutputStream output = new FileOutputStream("data/dataresult.txt")) {
            output.write(umnozhenie().getBytes());
            output.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}