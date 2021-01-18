package Final;

public class CordsValidation {
    static boolean cordsValidation (String cords, Ship ship) {
        String[] cordsArr = cords.split(GameConfig.SEPARATOR);

        return isCordsValid(cordsArr) && isCordsLengthValid(cordsArr, ship) && isCordsValidShip(cordsArr);
    }

    static boolean isCordsValid(String[] cordsArr) {
        for (int i = 0; i < cordsArr.length; i++) {
            String[] numbersString = cordsArr[i].split(GameConfig.NUMBER_SEPARATOR);
            if (numbersString.length != 2) return false;
            int x = Integer.parseInt(numbersString[0]);
            int y = Integer.parseInt(numbersString[1]);
            if (x > 9 || x < 0) return false;
            if (y > 9 || y < 0) return false;
        }
        return true;
    }

    static boolean isCordsLengthValid(String[] cordsArr, Ship ship) {
        return ship.getLife() == cordsArr.length;
    }

    static boolean isCordsValidShip(String[] cordsArr) {
        if (cordsArr.length == 1) return true;

        for (int i = 0; i < cordsArr.length - 1; i++) {
            String[] numbersString = cordsArr[i].split(GameConfig.NUMBER_SEPARATOR);
            String[] numbersString1 = cordsArr[i + 1].split(GameConfig.NUMBER_SEPARATOR);

            int x = Integer.parseInt(numbersString[0]);
            int y = Integer.parseInt(numbersString[1]);

            int x1 = Integer.parseInt(numbersString1[0]);
            int y1 = Integer.parseInt(numbersString1[1]);

            if (x == x1 && y + 1 != y1) return false;
            if (y == y1 && x + 1 != x1) return false;
        }
        return true;
    }
}
