package Theme_6;

import java.util.Scanner;

public class Easy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] numbers = inputLine.split(" ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            int number = Integer.parseInt(numbers[i]);
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }
}
