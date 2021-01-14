package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237)); // 5

    }

    public static int count7(int number) {
        if (number < 0) return 0;
        String numberString = number + "";
        String[] all = numberString.split("");

        String[] modifiedArray = Arrays.copyOfRange(all, 1, all.length);

        if (modifiedArray.length == 0) return Integer.parseInt(all[0]) == 7 ? 1 : 0;


        int numbers = Integer.parseInt(String.join("", modifiedArray));

        return Integer.parseInt(all[0]) == 7 ? 1 + count7(numbers) : count7(numbers);
    }
}
