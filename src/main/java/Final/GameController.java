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
                if (!isCordsValid) continue;
                //Узнает какое направление у корабля
                ShipDirection shipDirection = Utils.shipDirection(cords);
                //Вычесляем линии для ореола
                List<String> lineShipPosition = Utils.lineShipPositionGenerate(cords, shipDirection);
                //Делаем проверку на возможность добавить корабль
                boolean canShipAdd = currentPlayerField.checkShipCordsInField(lineShipPosition);
                if (!canShipAdd) continue;

                currentPlayerField.addShipToField(cords);
                //Положить кординаты в хешмагу вместе с кораблем, чтобы во время выстрела сразу доставать нужный корабль
                hashMap.setShip(cords, currentPlayerShips.get(count));
                //Сохраняем на будущее знаение корябля и его ореол, чтобы когда корабль потопим потом сразу достнем все значения
                currentPlayerShips.get(count).setShipCords(lineShipPosition);

                currentPlayerField.print();
//                hashMap.print();
                count++;
            }
        }


        //Переключатель очередности хода
        int whatPlayerMove = 0;
        //couте++ count-- или ничего не делаем если ход не переходит
        while (hasPlayerShip(this.whatPlayerOrder.get(whatPlayerMove))) {

            Scanner scanner = new Scanner(System.in);
            String cord = scanner.nextLine();

            //Можно пойти на поле. Если там не корабля, то говорить мимо
            // И ПЕРЕДАВАТЬ ХОД
            //1. Если там корабля, то идти в хешмапу и забирать корабль
            //2. Потом добавлять выстел в корабль и смотреть что возвращает корабль - потопил или попал
            //3. Когда попал, то после добавления попадания мыможем проверить потоплен корабль или нет,
            //4. если потоплен, то надо забрать из коробля все координаты и обновить карту
            //5. Далее просто идем дальше по циклу

        }

        //Если из цикла вышли, значит понимая кто был последний активный игрок тот и победил

    }

    private boolean hasPlayerShip(Player player){
        for (int i = 0; i < player.getPlayerShips().size(); i++) {
            //Если хоть один не потоплен, то true
            if(!player.getPlayerShips().get(i).getIsSink()) return true;
        }
        //Если все потоплены то false
        return false;
    }
}

