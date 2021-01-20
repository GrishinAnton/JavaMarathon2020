package Final;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapShips {
    private Map<String, Ship> hashMap = new HashMap<>();

    public void setShip(String cords, Ship ship) {
        String[] cordsArr = Utils.cordsSeparatorSplit(cords);
        for (int i = 0; i < cordsArr.length; i++) {
            this.hashMap.put(cordsArr[i], ship);
        }
    }

    public Ship getShip(String cord) {
        return this.hashMap.get(cord);
    }

    public void print() {
        Set<Map.Entry<String, Ship>> set = this.hashMap.entrySet();

        for (Map.Entry<String, Ship> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
//    Map<String, Integer> hashMap = new HashMap<>();
//
//// Помещаем данные на карточку
//        hashMap.put("Васька", 5);
//                hashMap.put("Мурзик", 8);
//                hashMap.put("Рыжик", 12);
//                hashMap.put("Барсик", 5);
//
//// Получаем набор элементов
//                Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
//
//// Отобразим набор
//        for (Map.Entry<String, Integer> me : set) {
//        System.out.print(me.getKey() + ": ");
//        System.out.println(me.getValue());
//        }
//
//// Добавляем значение
//        int value = hashMap.get("Рыжик");
//        hashMap.put("Рыжик", value + 3);
//        System.out.println("У Рыжика стало " + hashMap.get("Рыжик"));

