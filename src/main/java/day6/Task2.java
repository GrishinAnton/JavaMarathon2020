package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Russia", 1980, 2000, 1500, 100);
        air1.fillUp(200);
        air1.fillUp(400);
        System.out.println(air1.info());
    }
}
