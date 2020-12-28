package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int maxSummThreeElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) Math.ceil(Math.random() * 10000);
            numbers[i] = randomNumber;
        }

        Arrays.sort(numbers);
        for (int i = numbers.length - 3; i < numbers.length; i++) {
            maxSummThreeElement += numbers[i];
        }
        System.out.println(maxSummThreeElement);
        System.out.println(numbers.length - 3);
    }
}
