package Final;

public class CordsValidation {
    static boolean cordsValidation(String cords, Ship ship) {
        String[] cordsArr = Utils.cordsSeparatorSplit(cords);

        return isCordsValid(cordsArr) && isCordsLengthValid(cordsArr, ship) && isCordsValidShip(cordsArr);
    }

    static boolean isCordsValid(String[] cordsArr) {
        for (int i = 0; i < cordsArr.length; i++) {
            String[] numbersString = Utils.cordNumberSeparatorSplit(cordsArr[i]);
            if (numbersString.length != 2) {
                return Utils.exception(GameConfig.SEPARATOR_INVALID);
            }
            int x = Integer.parseInt(numbersString[0]);
            int y = Integer.parseInt(numbersString[1]);
            if (x > 9 || x < 0 || y > 9 || y < 0) {
                return Utils.exception(GameConfig.INVALID_NUMBER);
            }
        }
        return true;
    }

    static boolean isCordsLengthValid(String[] cordsArr, Ship ship) {
        if (ship.getLife() != cordsArr.length) {
            return Utils.exception(GameConfig.INVALID_CORD_SIZE);
        }
        return true;
    }

    static boolean isCordsValidShip(String[] cordsArr) {
        if (cordsArr.length == 1) return true;

        for (int i = 0; i < cordsArr.length - 1; i++) {
            String[] numbersString = Utils.cordNumberSeparatorSplit(cordsArr[i]);
            String[] numbersString1 = Utils.cordNumberSeparatorSplit(cordsArr[i + 1]);

            int x = Integer.parseInt(numbersString[0]);
            int y = Integer.parseInt(numbersString[1]);

            int x1 = Integer.parseInt(numbersString1[0]);
            int y1 = Integer.parseInt(numbersString1[1]);

            if (x == x1 && y + 1 != y1 || y == y1 && x + 1 != x1) {
                return Utils.exception(GameConfig.INVALID_CORD_DIRECTION);
            }
        }
        return true;
    }
}
