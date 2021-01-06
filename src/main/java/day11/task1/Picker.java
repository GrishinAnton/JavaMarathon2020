package day11.task1;

public class Picker implements Worker{
    int salary;
    boolean isPayed = false;
    Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(1);
    }

    @Override
    public void bonus() {
        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if(warehouse.getCountPickedOrders() >= 10000){
            salary += 70000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }
}
