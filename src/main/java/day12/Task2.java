package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i <= 350; i++) {
            if (i <= 30 && i % 2 == 0) {
                numberList.add(i);
                System.out.println(i);
            }

            if (i >= 300 && i <= 350 && i % 2 == 0) {
                numberList.add(i);
                System.out.println(i);
            }
        }
    }
}
