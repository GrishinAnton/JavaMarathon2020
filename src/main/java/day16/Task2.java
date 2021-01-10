package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        generatedNumber();
        summNumber();

        File file = new File("file2.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringArr = line.split(" ");
            double result = 0;

            for (int i = 0; i < stringArr.length; i++) {
                result += Double.parseDouble(stringArr[i]);
            }

            scanner.close();
            System.out.println((int) result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void summNumber() {
        try {
            PrintWriter pwFile2 = new PrintWriter("file2.txt");
            File file = new File("file1.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringArr = line.split(" ");
            double result = 0;

            for (int i = 0; i < stringArr.length; i++) {
                result += Integer.parseInt(stringArr[i]);

                if (i % 20 == 0 && i != 0) {
                    pwFile2.print(result / 20 + " ");
                    result = 0;
                }
            }

            scanner.close();
            pwFile2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void generatedNumber() {
        try {
            PrintWriter pwFile1 = new PrintWriter("file1.txt");
            for (int i = 0; i <= 1000; i++) {
                double random = Math.random() * 100;
                pwFile1.print((int) random + " ");
            }
            pwFile1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
