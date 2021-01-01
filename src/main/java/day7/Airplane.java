package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String info() {
        return "Изготовитель: " + this.producer + ", год выпуска: " + this.year + " , длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel + "";
    }

    public static void compareAirplanes(Airplane air1, Airplane air2) {
        if (air1.length > air2.length) {
            System.out.println("Первый самолет длиннее");
        } else if(air1.length < air2.length){
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }
}
