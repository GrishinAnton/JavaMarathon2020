package Final;

import Final.Enums.EShip;
import Final.Enums.FieldCell;
import Final.Enums.ShipDirection;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    static ShipDirection shipDirection(String cords) {
        String[] cordsArr = cords.split(GameConfig.SEPARATOR);
        ShipDirection direction = ShipDirection.HORIZONTAL;

        //Если у нас корабль S - то нам надо horizontal
        if (cordsArr.length == EShip.S_SHIP.getFieldCount()) return direction;

        //-1 так как нам не надо поверять последнее значение + 1, такого там не будет
        for (int i = 0; i < cordsArr.length - 1; i++) {
            String[] numbersString = cordsArr[i].split(GameConfig.NUMBER_SEPARATOR);
            String[] numbersString1 = cordsArr[i + 1].split(GameConfig.NUMBER_SEPARATOR);

            int x = Integer.parseInt(numbersString[0]);
            int y = Integer.parseInt(numbersString[1]);

            int x1 = Integer.parseInt(numbersString1[0]);
            int y1 = Integer.parseInt(numbersString1[1]);

            if (x == x1 && y + 1 != y1) direction = ShipDirection.VERTICAL;
            if (y == y1 && x + 1 != x1) direction = ShipDirection.HORIZONTAL;
        }
        return direction;
    }


    static List<String> cordsRangeGenerate(String cords) {
        String[] cordsArr = cords.split(GameConfig.SEPARATOR);
        List<String> result = new ArrayList<>();

        if (cordsArr.length == EShip.S_SHIP.getFieldCount()) {
            result.add(cordsArr[0]);
            result.add(cordsArr[0]);
        } else {
            result.add(cordsArr[0]);
            result.add(cordsArr[cordsArr.length - 1]);
        }

        return result;
    }

    static List<String> lineShipPositionGenerate(String cords, ShipDirection shipDirection) {
        List<String> cordsRange = cordsRangeGenerate(cords);
        List<String> lineShipPosition = new ArrayList<>();
        String firstLine = "";
        String middleLine = "";
        String lastLine = "";
        String[] numbersString = cordsRange.get(0).split(GameConfig.NUMBER_SEPARATOR);
        String[] numbersString1 = cordsRange.get(1).split(GameConfig.NUMBER_SEPARATOR);

        int x = Integer.parseInt(numbersString[0]);
        int y = Integer.parseInt(numbersString[1]);

        int x1 = Integer.parseInt(numbersString1[0]);
        int y1 = Integer.parseInt(numbersString1[1]);

        if (shipDirection == ShipDirection.HORIZONTAL) {
            firstLine = lineGenerator(x - 1, x1 + 1, y - 1, shipDirection);
            middleLine = lineGenerator(x - 1, x1 + 1, y, shipDirection);
            lastLine = lineGenerator(x - 1, x1 + 1, y + 1, shipDirection);
        }
        if (shipDirection == ShipDirection.VERTICAL) {
            firstLine = lineGenerator(y - 1, y1 + 1, x - 1, shipDirection);
            middleLine = lineGenerator(y - 1, y1 + 1, x, shipDirection);
            lastLine = lineGenerator(y - 1, y1 + 1, x + 1, shipDirection);
        }

        lineShipPosition.add(firstLine);
        lineShipPosition.add(middleLine);
        lineShipPosition.add(lastLine);
        //[-1,0;-1,1;-1,2, 0,0;0,1;0,2, 1,0;1,1;1,2]

        return lineShipPosition;

    }

    static String lineGenerator(int start, int end, int line, ShipDirection direction) {
        String result = "";
        for (int i = Math.max(start, 0); i <= Math.max(end, 0); i++) {
            if (direction == ShipDirection.HORIZONTAL)
                result += i + GameConfig.NUMBER_SEPARATOR + line + GameConfig.SEPARATOR;
            if (direction == ShipDirection.VERTICAL)
                result += line + GameConfig.NUMBER_SEPARATOR + i + GameConfig.SEPARATOR;

        }
        //Отрезаем последние ;
        return result.substring(0, result.length() - 1);
    }
}
