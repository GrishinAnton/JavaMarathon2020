package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String evaluate(Student student) {
        int randomValue = (int) Math.ceil(1 + Math.random() * 3);
        return "Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + this.changeRating(randomValue) + ".";
    }

    private String changeRating(int value){
        String rating = "оценка не определена";
        switch (value){
            case 2:
                rating =  "неудовлетворительно";
                break;
            case 3:
                rating =   "удовлетворительно";
                break;
            case 4:
                rating =   "хорошо";
                break;
            case 5:
                rating =   "отлично";
                break;
        }

        return rating;
    }
}
