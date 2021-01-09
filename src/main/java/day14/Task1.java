package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/test/resources/D14T1_1.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numberString = line.split(" ");
            int[] numbers = new int[numberString.length];
            int count = 0;
            int result = 0;

            for (String number : numberString) {
                numbers[count++] = Integer.parseInt(number);
            }

            if (numbers.length != 10) {
                throw new Exception();
            }

            for (int i = 0; i < numbers.length; i++) {
                result += numbers[i];
            }
            scanner.close();

            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
