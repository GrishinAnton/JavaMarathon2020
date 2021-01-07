package day11.task1;

public class Warehouse {
    private int countPickedOrders = 0;
    private int countDeliveredOrders = 0;

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

    public void incrementCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders += countPickedOrders;
    }

    public void incrementCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders += countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
}
