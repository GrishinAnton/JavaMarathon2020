package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla", "Mercedes"));

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
        System.out.println("");

        carList.add(Math.round(carList.size() / 2), "VAZ");
        for (int i = 0; i < carList.toArray().length; i++) {
            System.out.println(carList.get(i));
        }
        System.out.println("");
        carList.remove(0);
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
    }
}
