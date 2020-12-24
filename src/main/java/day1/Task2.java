package day1;

public class Task2 {
    public static void main(String[] args) {
        String message = "JAVA ";
        int count = 0;
        for (; count < 9; ) {
            message += "JAVA" + " ";
            count = count += 1;
        }

        System.out.print(message);
    }
}
