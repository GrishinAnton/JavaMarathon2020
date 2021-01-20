package Final;

import Final.Enums.ShipDirection;

import java.util.List;
import java.util.Scanner;

import static Final.CordsValidation.cordsValidation;


public class GameController {
    private Player playerOne;
    private Player playerTwo;
    private HashMapShips hashMap;
    private List<Player> whatPlayerOrder;

    public GameController(String playerOneName, String playerTwoName) {
        this.playerOne = new Player(playerOneName);
        this.playerTwo = new Player(playerTwoName);
    }

    private void Init() {
        this.playerOne.setPlayerField(new PlayerField());
        this.playerTwo.setPlayerField(new PlayerField());

        this.playerOne.setPlayerShips(GameConfig.getPlayerShips());
        this.playerTwo.setPlayerShips(GameConfig.getPlayerShips());

        this.hashMap = new HashMapShips();

        //Можно перед запросом проверять, что кол-во кораблей равно кол-ву текста и если нет, выплевывать ошибку при старте программы
        boolean initConfig = GameConfig.initConfig();
    }

    public void Start() {
        this.Init();
        this.whatPlayerOrder = GameConfig.whatPlayerStart(this.playerOne, this.playerTwo);
        int count = 0;
        //Первый цикл будет по игрокам для сборка кораблей - внутри будут еще циклы
        for (int i = 0; i < this.whatPlayerOrder.size(); i++) {
            count = 0;

            System.out.println(GameConfig.getGreeting(this.whatPlayerOrder.get(i).getName()));

            List<String> shipPositionText = GameConfig.getTextForShipsPosition();
            Scanner scanner = new Scanner(System.in);

            while (count < shipPositionText.size()) {
                List<Ship> currentPlayerShips = this.whatPlayerOrder.get(i).getPlayerShips();
                PlayerField currentPlayerField = this.whatPlayerOrder.get(i).getPlayerField();

                System.out.println(shipPositionText.get(count));
                String cords = scanner.nextLine();
                //Проверяем корректность введенных данных
                boolean isCordsValid = cordsValidation(cords, currentPlayerShips.get(count));
                if(!isCordsValid) continue;
                //Узнает какое направление у корабля
                ShipDirection shipDirection = Utils.shipDirection(cords);
                //Вычесляем линии для ореола
                List<String> lineShipPosition = Utils.lineShipPositionGenerate(cords, shipDirection);
                //Делаем проверку на возможность добавить корабль
                boolean canShipAdd = currentPlayerField.checkShipCordsInField(lineShipPosition);

                if (canShipAdd) {
                    currentPlayerField.addShipToField(cords);
                    //Положить кординаты в хешмагу вместе с кораблем, чтобы во время выстрела сразу доставать нужный корабль
                    hashMap.setShip(cords, currentPlayerShips.get(count));
                    //Сохраняем на будущее знаение корябля и его ореол, чтобы когда корабль потопим потом сразу достнем все значения
                    currentPlayerShips.get(count).setShipCords(lineShipPosition);
                }

                currentPlayerField.print();
//                hashMap.print();
                count++;
            }
        }

        //Второй цикл уже будет по самой игре


    }
}

