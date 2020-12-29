package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher tea1 = new Teacher("Soup", "math");
        Student stud1 = new Student("loup");

        System.out.println(tea1.evaluate(stud1));
    }
}
