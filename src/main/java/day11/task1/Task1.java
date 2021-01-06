package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);

        courier1.doWork();
        
//        businessProcess(picker1);
//        businessProcess(courier1);

        System.out.println(courier1.toString());
        System.out.println(picker1.toString());
        System.out.println(warehouse1.toString());



    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }

        worker.bonus();

    }

}
