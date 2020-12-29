package day6;

public class Motorbike {
    private String color;
    private int yearOfCreate;
    private String model;

    public Motorbike(String color, int yearOfCreate, String model){
        this.color = color;
        this.yearOfCreate = yearOfCreate;
        this.model = model;
    }

    public String info(){
        return "Это мотоцикл";
    }

    public int yearDifference(int inputYear) {
        if (inputYear > this.yearOfCreate) {
            return inputYear - this.yearOfCreate;
        } else {
            return this.yearOfCreate - inputYear;
        }
    }

    public String getColor() {
        return color;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public String getModel() {
        return model;
    }
}
