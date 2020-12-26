package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int floor = s.nextInt();
        if (floor <= 0) {
            System.out.println("Ошибка ввода");
        } else if (floor <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floor <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        System.out.println("Многоэтажный дом");
    }
}
