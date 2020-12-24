package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 3;
        int count = 1;

        while (count <= 9) {
            int mult = count * k;
            System.out.println(count + " x " + k + " = " + mult);
            count = count += 1;
        }
    }
}
