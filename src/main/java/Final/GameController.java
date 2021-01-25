package Final;

import Final.Enums.FieldCell;
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

        this.playerOne.setHashMap(new HashMapShips());
        this.playerTwo.setHashMap(new HashMapShips());

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

                currentPlayerField.addValueToField(cords, FieldCell.SHIP);
                //Положить кординаты в хешмагу вместе с кораблем, чтобы во время выстрела сразу доставать нужный корабль
                this.whatPlayerOrder.get(i).getHashMap().setShip(cords, currentPlayerShips.get(count));
                //Сохраняем на будущее знаение корябля и его ореол, чтобы когда корабль потопим потом сразу достнем все значения
                currentPlayerShips.get(count).setShipCords(lineShipPosition);

                currentPlayerField.print();
//                hashMap.print();
                count++;
            }
        }


        //Переключатель очередности хода
        int whatPlayerAttack = 0;
        int whatPlayerDefender = 1;
        //couт++ count-- или ничего не делаем если ход не переходит
        while (hasPlayerShip(this.whatPlayerOrder.get(whatPlayerDefender))) {
            System.out.println(hasPlayerShip(this.whatPlayerOrder.get(whatPlayerDefender)));
            System.out.println(this.whatPlayerOrder.get(whatPlayerDefender).getName());
            System.out.println(whatPlayerAttack+"whatPlayerAttack");
            System.out.println(whatPlayerDefender+"whatPlayerDefender");

            System.out.println("Ход игрока: "+this.whatPlayerOrder.get(whatPlayerAttack).getName());
            Scanner scanner = new Scanner(System.in);
            String cord = scanner.nextLine();
            FieldCell hitValue =  this.whatPlayerOrder.get(whatPlayerDefender).getPlayerField().getCellValue(cord);

            if(hitValue != FieldCell.SHIP){
                this.whatPlayerOrder.get(whatPlayerDefender).getPlayerField().addValueToField(cord, FieldCell.HIT);
                System.out.println("Мимо");
                whatPlayerAttack = whatPlayerAttack == 0 ? 1: 0;
                whatPlayerDefender = whatPlayerAttack == 0 ? 1: 0;;
                continue;
            }

            Ship ship = this.whatPlayerOrder.get(whatPlayerDefender).getHashMap().getShip(cord);
            //Возвращает что с кораблем случилось
            String shipHit = ship.addHit();
            System.out.println(shipHit);
            if(ship.getIsSink()){
                for (int i = 0; i < ship.getShipCords().size(); i++) {
                    this.whatPlayerOrder.get(whatPlayerDefender).getPlayerField().addValueToField(ship.getShipCords().get(i), FieldCell.HIT);
                }
            } else {
                this.whatPlayerOrder.get(whatPlayerDefender).getPlayerField().addValueToField(cord, FieldCell.HIT);
            }

            this.whatPlayerOrder.get(whatPlayerDefender).getPlayerField().print();
            continue;

        }
        System.out.println("Конец! Победил игрок: "+ this.whatPlayerOrder.get(whatPlayerAttack).getName());

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

