package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "";
        long start = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++) {
            s += i + " ";
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        System.out.println(s);
        System.out.println(timeConsumedMillis);

        StringBuilder s2 = new StringBuilder("");
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++) {
            s2.append(i + " ");
        }
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;

        System.out.println(s2);
        System.out.println(timeConsumedMillis2);
    }
}
