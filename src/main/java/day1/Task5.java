package day1;

public class Task5 {
    public static void main(String[] args) {
        int year = 1980;
        for (; year <= 2020; ) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
    }
}
