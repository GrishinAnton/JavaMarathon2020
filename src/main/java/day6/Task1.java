package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.info());
        Motorbike moto1 = new Motorbike("red", 1980, "honda");
        System.out.println(moto1.info());
        System.out.println(moto1.yearDifference(1980));
    }
}
