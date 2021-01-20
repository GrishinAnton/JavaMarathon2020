package Final;

import Final.Enums.EShip;

import java.util.*;

public class GameConfig {
    static final String SEPARATOR = ";";
    static final String NUMBER_SEPARATOR = ",";
    static final String SEPARATOR_INVALID = "Вы указали неверный разделитель";
    static final String INVALID_NUMBER = "Укажите числа от 0 до 9";

    static List<Ship> getPlayerShips() {
        List<Ship> playerShips = new ArrayList<>(
                Arrays.asList(
                        new Ship(EShip.XL_SHIP),
                        new Ship(EShip.L_SHIP),
                        new Ship(EShip.L_SHIP),
                        new Ship(EShip.M_SHIP),
                        new Ship(EShip.M_SHIP),
                        new Ship(EShip.M_SHIP),
                        new Ship(EShip.S_SHIP),
                        new Ship(EShip.S_SHIP),
                        new Ship(EShip.S_SHIP),
                        new Ship(EShip.S_SHIP)
                )
        );
        return playerShips;
    }

    static List<String> getTextForShipsPosition() {
        List<String> positionText = new ArrayList<>(
                Arrays.asList(
                        "Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)",
                        "Введите координаты первого трехпалубного корабля (формат: x,y;x,y;x,y)",
                        "Введите координаты второго трехпалубного корабля (формат: x,y;x,y;x,y)",
                        "Введите координаты первого двухпалубного корабля (формат: x,y;x,y;x,y)",
                        "Введите координаты второго двухпалубного корабля (формат: x,y;x,y;x,y)",
                        "Введите координаты третьего двухпалубного корабля (формат: x,y;x,y;x,y)",
                        "Введите координаты первого однопалубного корабля (формат: x,y;x,y;x,y)",
                        "Введите координаты второго однопалубного корабля (формат: x,y;x,y;x,y)",
                        "Введите координаты третьего однопалубного корабля (формат: x,y;x,y;x,y)",
                        "Введите координаты четвертого однопалубного корабля (формат: x,y;x,y;x,y)"
                )
        );
        return positionText;
    }

    static String getGreeting(String player) {
        return "Начнем расставлять корабля на поле " + player + ". Другой игрок не смотри!";
    }

    static boolean initConfig() {
        return getPlayerShips().size() == getTextForShipsPosition().size();
    }

    static List<Player> whatPlayerStart(Player playerOne, Player playerTwo) {
        List<Player> orderPlayers = new ArrayList<>();
        if (Math.round(Math.random()) == 1) {
            orderPlayers.add(playerOne);
            orderPlayers.add(playerTwo);

        } else {
            orderPlayers.add(playerTwo);
            orderPlayers.add(playerOne);
        }
        return orderPlayers;
    }
}
