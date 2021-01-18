package Final;

import Final.Enums.EShip;
import Final.Enums.ShipDirection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class main {

    public static void main(String[] args) {

        GameController gameController = new GameController("Anton", "Sergei");

        gameController.Start();


//        PlayerField playerField = new PlayerField();
//        playerField.addShipToField("0,0;1,0", new Ship(EShip.M_SHIP));
//        playerField.addShipToField("0,2;1,2;2,2;3,2", new Ship(EShip.XL_SHIP));
//        playerField.addShipToField("5,5;5,6", new Ship(EShip.M_SHIP));
//        playerField.print();
    }
}
