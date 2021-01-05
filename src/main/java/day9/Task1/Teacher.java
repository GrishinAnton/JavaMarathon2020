package day9.Task1;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.name = name;
        this.subjectName = subjectName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.name);
    }

    public String getSubjectName() {
        return subjectName;
    }
}
