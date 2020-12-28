package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int maxNumber = 0;
        int minNumber = (int) Math.round(Math.random() * 10000);
        int endZero = 0;
        int endZeroSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = (int) Math.round(Math.random() * 10000);
            numbers[i] = randomNumber;
        }

        for (int number : numbers) {
            maxNumber = Math.max(maxNumber, number);
            minNumber = Math.min(minNumber, number);
            if (number % 10 == 0) endZero += 1;
            if (number % 10 == 0) endZeroSum += number;

        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(endZero);
        System.out.println(endZeroSum);

    }
}
