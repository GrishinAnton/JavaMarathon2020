package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] numbers = new int[count];
        int moreEight = 0;
        int equalOne = 0;
        int even = 0;
        int odd = 0;
        int summ = 0;

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) Math.round(Math.random() * 10);

            if (randomNumber > 8) moreEight += 1;
            if (randomNumber == equalOne) equalOne += 1;
            if (randomNumber % 2 == 0) even += 1;
            if (randomNumber % 2 != 0) odd += 1;
            summ += randomNumber;

            numbers[i] = randomNumber;
        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + moreEight);
        System.out.println("Количество чисел равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + summ);

    }
}
