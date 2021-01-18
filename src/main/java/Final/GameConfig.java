package Final;

import Final.Enums.EShip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameConfig {
    static final int MAX_XL_SHIP = 1;
    static final int MAX_L_SHIP = 2;
    static final int MAX_M_SHIP = 3;
    static final int MAX_S_SHIP = 4;
    static final int FIELD_SIZE = 10;
    static final int PLAYER_COUNT = 2;
    static final String SEPARATOR = ";";
    static final String NUMBER_SEPARATOR = ",";


    static List<Ship> getPlayerShips() {
        List<Ship> playerShips = new ArrayList<>(
                Arrays.asList(
                        new Ship(EShip.XL_SHIP),
                        new Ship(EShip.L_SHIP)
//                        new Ship(EShip.L_SHIP),
//                        new Ship(EShip.M_SHIP),
//                        new Ship(EShip.M_SHIP),
//                        new Ship(EShip.M_SHIP),
//                        new Ship(EShip.S_SHIP),
//                        new Ship(EShip.S_SHIP),
//                        new Ship(EShip.S_SHIP),
//                        new Ship(EShip.S_SHIP)
                )
        );
        return playerShips;
    }

    static List<String> getTextForShipsPosition() {
        List<String> positionText = new ArrayList<>(
                Arrays.asList(
                        "Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)",
                        "Введите координаты первого трехпалубного корабля (формат: x,y;x,y;x,y)"
                )
        );
        return positionText;
    }

    static String getGreeting(String player) {
        return "Начнем расставлять корабля на поле " + player + ". Другой игрок не смотри!";
    }
}