package day9.Task1;

public class Student extends Human{
    String groupName;

    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем "+this.name);
        System.out.println("Этот студент с именем "+this.name);
    }

    public String getGroupName() {
        return groupName;
    }
}
