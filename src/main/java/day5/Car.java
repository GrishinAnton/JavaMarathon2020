package day5;

public class Car {
    private String color;
    private int yearOfCreate;
    private String model;

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
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
