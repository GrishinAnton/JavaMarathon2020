package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/test/resources/D14T1_1.txt");

        printResult(file);
    }

    public static void printResult(File file) {
        DecimalFormat decimalFormat = new DecimalFormat("0.###");


        Scanner scanner = null;
        try {
            scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] stringArr = line.split(" ");
            double result = 0;

            for (String number : stringArr) {
                result += (float) Integer.parseInt(number);
            }

            double d = result / stringArr.length;

            System.out.printf(d + " --> " + decimalFormat.format(d));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

