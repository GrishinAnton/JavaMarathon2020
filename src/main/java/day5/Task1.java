package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("red");
        car1.setModel("honda");
        car1.setYearOfCreate(2000);


        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getYearOfCreate());
    }
}
