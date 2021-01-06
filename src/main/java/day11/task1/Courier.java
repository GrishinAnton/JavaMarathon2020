package day11.task1;

public class Courier implements Worker {
    int salary;
    boolean isPayed;
    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(1);
    }

    @Override
    public void bonus() {
        if(isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if(warehouse.getCountDeliveredOrders() >= 10000){
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
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
