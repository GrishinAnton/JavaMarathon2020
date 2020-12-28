package day5;

public class Motorbike {
    private String color;
    private int yearOfCreate;
    private String model;

    public Motorbike(String color, int yearOfCreate, String model){
        this.color = color;
        this.yearOfCreate = yearOfCreate;
        this.model = model;
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
