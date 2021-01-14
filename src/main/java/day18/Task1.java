package day18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int counter){
        if(counter == numbers.length -1) return numbers[numbers.length -1];
        return numbers[counter] + recursionSum(numbers, counter + 1);
    }
}
