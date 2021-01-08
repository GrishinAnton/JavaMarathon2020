package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/test/resources/D14T2_1.txt");
        parseFileToStringList(file);

    }

    public static List<String> parseFileToStringList(File file) {
        List<String> names = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                String[] nameArr = name.split(" ");
                if (Integer.parseInt(nameArr[1]) <= 0) {
                    throw new Exception();
                }
                names.add(name);
            }
            System.out.println(names);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }
        return names;
    }
}
