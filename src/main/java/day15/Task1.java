package day15;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");

        readFile(file);
    }

    public static void readFile(File file) {
        File fileToWrite = new File("test.txt");

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(fileToWrite);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoeArr = line.split(";");
                if(Integer.parseInt(shoeArr[2]) == 0){
                    String st = String.join(", ", shoeArr);
                    pw.println(st);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
