package Final;

import Final.Enums.ShipDirection;

import java.util.List;
import java.util.Scanner;

import static Final.CordsValidation.cordsValidation;


public class GameController {
    String playerOneName;
    String playerTwoName;
    PlayerField playerOneField;
    PlayerField playerTwoField;
    List<Ship> playerOneShips;
    List<Ship> playerTwoShips;
    HashMapShips hashMap;
    String whatPlayerStart;

    public GameController(String name1, String name2) {
        this.playerOneName = name1;
        this.playerTwoName = name2;
    }

    private void Init() {
        this.playerOneField = new PlayerField();
        this.playerTwoField = new PlayerField();

        this.playerOneShips = GameConfig.getPlayerShips();
        this.playerTwoShips = GameConfig.getPlayerShips();

        this.hashMap = new HashMapShips();
    }

    public void Start() {
        this.Init();

        this.whatPlayerStart = Math.round(Math.random()) == 1 ? this.playerOneName : this.playerTwoName;
        System.out.println(GameConfig.getGreeting(this.whatPlayerStart));

        List<String> shipPositonText = GameConfig.getTextForShipsPosition();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < shipPositonText.size(); i++) {
            System.out.println(shipPositonText.get(i));
            String cords = scanner.nextLine();
            //Проверяем корректность введенных данных
            boolean isShipValid = cordsValidation(cords, this.playerOneShips.get(i));
            //Узнает какое направление у корабля
            ShipDirection shipDirection = Utils.shipDirection(cords);
            //Вычесляем линии для ореола
            List<String> lineShipPosition = Utils.lineShipPositionGenerate(cords, shipDirection);
            //Делаем проверку на возможность добавить корабль
            boolean canShipAdd = this.playerOneField.checkShipCordsInField(lineShipPosition);

            if(canShipAdd){
                this.playerOneField.addShipToField(cords);
                //Положить кординаты в хешмагу вместе с кораблем, чтобы во время выстрела сразу доставать нужный корабль
                hashMap.setShip(cords, this.playerOneShips.get(i));
                //Сохраняем на будущее знаение корябля и его ореол, чтобы когда корабль потопим потом сразу достнем все значения
                this.playerOneShips.get(i).setShipCords(lineShipPosition);
            }
        }

        this.playerOneField.print();
    }
}
