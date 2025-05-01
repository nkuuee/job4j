
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogFilter {
    private final String file;

    public LogFilter(String file) {
        this.file = file;
    }

    public List<String> filter() {
        List<String> result = new ArrayList<>();
        String read;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            while ((read = reader.readLine()) != null) {
                String[] razdelenie = read.trim().split("\\s+");
                String ishem = razdelenie[razdelenie.length - 2];

                if (ishem.equals("404")) {
                    result.add(read);
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден " + e);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при закрытие файлы " + e);
        }
        return result;
    }

    public void saveTo(String out) {  //Зачем нужен "out" ?
        var data = filter();

        try (PrintWriter output = new PrintWriter(
                new BufferedOutputStream(
                        new FileOutputStream("data/404.txt")
                ))) {
            //output.println(data);

            for (String line : data) {
                output.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден" + e);
        }
    }

    public static void main(String[] args) throws IOException {
        LogFilter logFilter = new LogFilter("data/log.txt");
        new LogFilter("data/log.txt").saveTo("data/404.txt");

        for (String vivod : logFilter.filter()) {
            System.out.println(vivod);
        }

    }
}
