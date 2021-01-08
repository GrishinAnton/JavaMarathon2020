package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("src/test/resources/D14T2_1.txt");
        List<Person> personList =  parseFileToObjList(file);
        for (Person person: personList){
            System.out.println(person.toString());
        }
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                String[] nameArr = name.split(" ");
                if (Integer.parseInt(nameArr[1]) <= 0) {
                    throw new Exception();
                }
                personList.add(new Person(nameArr[0], Integer.parseInt(nameArr[1])));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            System.out.println("Некорректный входной файл");
        }

        return personList;
    }

    public static class Person {
        String name;
        int year;

        public Person(String name, int year) {
            this.name = name;
            this.year = year;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    '}';
        }
    }
}
